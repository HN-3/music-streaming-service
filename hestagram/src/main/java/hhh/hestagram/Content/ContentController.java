package hhh.hestagram.Content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hestagram")
public class ContentController {

    private final ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping("/contents/new") //{nickname}
    public Long createPost(@RequestBody ContentSaveRequestDto contentSaveRequestDto) {
        return contentService.saveContent(contentSaveRequestDto);
    }
    

}
