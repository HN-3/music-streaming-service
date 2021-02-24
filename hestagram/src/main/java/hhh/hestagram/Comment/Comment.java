package hhh.hestagram.Comment;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(schema="hestagram", name="Comment")
public class Comment extends BaseTimeEntity {

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

    /*@Column(name = "upload_time", nullable = false)
    private Date uploadTime;*/

    @Builder
    public Comment(Long contentIndex, Long userIndex, String commentText) { //Date uploadTime) {
        this.contentIndex = contentIndex;
        this.userIndex = userIndex;
        this.commentText = commentText;
        //this.uploadTime = uploadTime;
    }
}
