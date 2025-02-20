package com.lekimthanh.taoxanh.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Service
public class UploadService {
    private final ServletContext servletContext;

    public UploadService(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String handleSaveUploadFile(MultipartFile file, String targetFolder) {
        if (file.isEmpty()) {
            return "";
        }

        String rootPath = this.servletContext.getRealPath("/resources/images");
        Path uploadPath = Paths.get(rootPath, targetFolder);

        File dir = uploadPath.toFile();
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // Đặt tên file duy nhất
        String finalName = UUID.randomUUID().toString() + "-" + file.getOriginalFilename();
        File serverFile = new File(dir, finalName);

        try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile))) {
            stream.write(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Lỗi khi lưu tệp: " + e.getMessage(), e);
        }

        return finalName;
    }
}
