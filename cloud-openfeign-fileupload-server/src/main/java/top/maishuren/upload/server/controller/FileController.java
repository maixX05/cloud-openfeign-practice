package top.maishuren.upload.server.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author maisrcn@qq.com
 * @site <a href="https://www.maishuren.top">blog</a>
 * @since 2024-03-01
 */
@RestController
public class FileController {

    @PostMapping(value = "/uploadFile/server", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUploadServer(MultipartFile file) {
        // save file and return file address
        return "http://localhost/" + file.getOriginalFilename();
    }
}
