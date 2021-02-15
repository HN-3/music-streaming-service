package hhh.hestagram.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@Table(schema="hestagram", name="Comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_index", nullable = false)
    private Long commentIndex;

    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    @Column(name = "user_index", nullable = false)
    private Long userIndex;

    @Column(name = "comment_text", nullable = false)
    private String commentText;

    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    @Builder
    public Comment(Long contentIndex, Long userIndex, String commentText, Date updateTime) {
        this.contentIndex = contentIndex;
        this.userIndex = userIndex;
        this.commentText = commentText;
        this.updateTime = updateTime;
    }
}
