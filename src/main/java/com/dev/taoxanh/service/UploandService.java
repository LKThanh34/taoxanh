package com.dev.taoxanh.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Service
public class UploandService {

    // đổi tượng này có chức năng lấy đường đẫn thực tới các thư  mục tài nguyên trong môi trường máy chủ nơi ứng dụng dược triển khai
    private final ServletContext servletContext;

    public UploandService(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String handleSaveUploandFile(MultipartFile file, String targetFolder){
        // relative path:-> absolute path
                    String rootPath = this.servletContext.getRealPath("/resources/images");
                    String finalName = "";
                    try {
            byte[] bytes = file.getBytes();

            

            File dir = new File(rootPath + File.separator + targetFolder);
            if (!dir.exists())
                dir.mkdirs();

            // Create the file on server
            finalName = System.currentTimeMillis() + "-" + file.getOriginalFilename();

            File serverFile = new File(dir.getAbsolutePath() + File.separator + finalName);

            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(serverFile));
            stream.write(bytes);
            // stream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return finalName;
    }
    


    
}
