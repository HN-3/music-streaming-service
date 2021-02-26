package hhh.hestagram.Comment;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
import hhh.hestagram.Content.Content;
import hhh.hestagram.User.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(schema="hestagram", name="Comment")
@DynamicInsert
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_index", nullable = false)
    private Long commentIndex;

    @ManyToOne(targetEntity = Content.class, fetch = FetchType.LAZY)
    @JoinColumn(name="content_index")
    private Content content;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name="user_index")
    private User user;

    @Column(name = "comment_text", nullable = false)
    private String commentText;

    @Builder
    public Comment(Content content, User user, String commentText) {
        this.content = content;
        this.user = user;
        this.commentText = commentText;
    }
}
