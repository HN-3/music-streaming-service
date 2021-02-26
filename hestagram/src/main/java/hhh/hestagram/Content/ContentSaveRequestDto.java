package hhh.hestagram.Content;

import hhh.hestagram.User.User;
import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Getter
@NoArgsConstructor
public class ContentSaveRequestDto {
    private String photo;
    private String contentText;
    private Long likeCount;
    private User user;

    @Builder
    public ContentSaveRequestDto(String photo,
                                 String contentText, Long likeCount, User user) {
        this.photo = photo;
        this.contentText = contentText;
        this.likeCount = likeCount;
        this.user = user;
    }

    public Content toEntity() {
        return Content.builder()
                .photo(photo)
                .contentText(contentText)
                .likeCount(likeCount)
                .user(user)
                .build();
    }
}
