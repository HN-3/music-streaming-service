package hhh.hestagram.Content;

import com.amazonaws.services.s3.AmazonS3Client;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    //@RequestMapping(value = "/contents/new", method = RequestMethod.POST)
    public String createPost(@RequestBody ContentSaveRequestDto contentSaveRequestDto) {
        contentService.saveContent(contentSaveRequestDto); // db save
        return s3PresignedURL.getPreSignedURL("1/1");
    }
    

}
