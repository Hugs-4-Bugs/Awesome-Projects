package com.example.fileuploadservice.service;


import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileUploadService {
    String uploadFiles(List<MultipartFile> files);
}
