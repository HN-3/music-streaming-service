package hhh.hestagram.Content;

import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor // final 멤버변수가 있으면 생성자 항목에 포함시킴
@RestController
@RequestMapping("/hestagram")
public class ContentController {
    @Autowired
    private final ContentService contentService;
    private final S3PresignedURL s3PresignedURL;

    @ResponseBody
    @PostMapping("/contents/new") //{nickname}
    public String createPost(@RequestBody ContentSaveRequestDto contentSaveRequestDto) throws IOException {
        contentService.saveContent(contentSaveRequestDto); // db save
        return s3PresignedURL.getPreSignedURL("1/1");
    }
    

}
