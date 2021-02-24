package hhh.hestagram.Comment;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {
    private Long contentIndex;
    private Long userIndex;
    private String commentText;
    private Date updateTime;
}
