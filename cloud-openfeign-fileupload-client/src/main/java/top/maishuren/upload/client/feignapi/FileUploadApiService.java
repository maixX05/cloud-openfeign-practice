package top.maishuren.upload.client.feignapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import top.maishuren.upload.client.config.FeignMultipartSupportConfig;

/**
 * @author maisr@tsintergy.com
 * @since 2024-03-01
 */
@FeignClient(value = "openfeign-file-server", configuration = FeignMultipartSupportConfig.class)
public interface FileUploadApiService {
    /***
     * 1.produces,consumes必填
     * 2.注意区分@RequestPart和RequestParam，不要将
     * @RequestPart(value = "file") 写成@RequestParam(value = "file")
     * @param file
     * @return
     */
    @PostMapping(value = "/uploadFile/server",
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String fileUpload(@RequestPart(value = "file") MultipartFile file);
}
