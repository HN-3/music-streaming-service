package hhh.hestagram.Content;

import hhh.hestagram.User.User;
import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Getter
@NoArgsConstructor
public class ContentSaveRequestDto {
    private String contentText;
    private Long likeCount;
    private User user;

    @Builder
    public ContentSaveRequestDto(String contentText, Long likeCount, User user) {
        this.contentText = contentText;
        this.likeCount = likeCount;
        this.user = user;
    }

    public Content toEntity() {
        return Content.builder()
                .contentText(contentText)
                .likeCount(likeCount)
                .user(user)
                .build();
    }
}
