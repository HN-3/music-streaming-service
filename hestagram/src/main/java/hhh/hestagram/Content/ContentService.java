package hhh.hestagram.Content;

import java.util.List;

public interface ContentService {

    Long saveContent(ContentSaveRequestDto contentSaveRequestDto);
    Content deleteByContentId(Long contentId);
    Content updateByContentId(Long contentId);
    List<Content> findByUserId(Long userId);
    Long updateLikeCount(Long contentId);

}
