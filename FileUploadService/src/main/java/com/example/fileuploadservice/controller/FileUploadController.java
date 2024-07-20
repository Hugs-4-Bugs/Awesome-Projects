package com.example.fileuploadservice.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileUploadController {

    private static final String UPLOAD_DIR = "./uploads";

    @PostMapping("/upload")
    @ResponseBody
    public ResponseEntity<?> uploadFiles(@RequestParam("files") MultipartFile[] files) {
        if (files == null || files.length == 0) {
            return ResponseEntity.badRequest().body("No files uploaded!");
        }

        List<String> fileNames = new ArrayList<>();

        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                continue; // Skip empty files
            }

            String fileName = StringUtils.cleanPath(file.getOriginalFilename());

            // Save the file to the uploads directory
            try {
                File uploadDir = new File(UPLOAD_DIR);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }

                try (FileOutputStream fos = new FileOutputStream(uploadDir.getPath() + File.separator + fileName)) {
                    fos.write(file.getBytes());
                }

                fileNames.add(fileName);
            } catch (IOException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload " + fileName + "!");
            }
        }

        return ResponseEntity.ok("Successfully uploaded: " + fileNames);
    }
}
