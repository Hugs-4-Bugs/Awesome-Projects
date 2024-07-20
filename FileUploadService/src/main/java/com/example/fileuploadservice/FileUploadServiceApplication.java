package com.example.fileuploadservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FileUploadServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadServiceApplication.class, args);
    }

}
