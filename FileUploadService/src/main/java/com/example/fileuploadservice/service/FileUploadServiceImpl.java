package com.example.fileuploadservice.service;



import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.example.fileuploadservice.service.FileUploadService;

import java.io.IOException;
import java.util.List;

@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Override
    public String uploadFiles(List<MultipartFile> files) {
        // Your implementation to handle file upload logic (e.g., saving files to a storage location)
        return "Files uploaded successfully";
    }
}
