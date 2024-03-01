package top.maishuren.upload.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.maishuren.upload.client.feignapi.FileUploadApiService;

/**
 * @author maisrcn@qq.com
 * @site <a href="https://www.maishuren.top">blog</a>
 * @since 2024-03-01
 */
@RestController
@RequestMapping("file")
public class FeignUploadController {

    @Autowired
    private FileUploadApiService fileUploadApiService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String imageUpload(MultipartFile file) {
        return fileUploadApiService.fileUpload(file);
    }
}
