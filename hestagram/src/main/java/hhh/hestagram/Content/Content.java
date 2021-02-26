package hhh.hestagram.Content;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
import hhh.hestagram.Comment.Comment;
import hhh.hestagram.User.User;
import hhh.hestagram.hashtag.Hashtag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(schema="hestagram", name="Content")
@DynamicInsert
public class Content extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    @Column(name = "user_content_index", nullable = false)
    private Long userContentIndex;

    @Column(name = "photo")
    private String photo;

    @Column(name = "content_text")
    @ColumnDefault("null")
    private String contentText;

    @Column(name = "like_count")
    @ColumnDefault("0")
    private Long likeCount;

    @OneToMany(mappedBy = "content")
    private List<Comment> comment = new ArrayList<>();

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name="user_index")
    private User user;

    @OneToMany(mappedBy = "content")
    private List<Hashtag> hashtags = new ArrayList<>();

    @Override
    public String toString() {
        return "Content{" +
                "contentIndex=" + contentIndex +
                ", userContentIndex='" + userContentIndex +
                ", photo=" + photo +
                ", contentText=" + contentText +
                ", likeCount=" + likeCount +
                '}';
        // System.out.println("order = " + order); 로 객체 호출 시에 이 함수(toString) 호출
    }

    @Builder
    public Content(Long userContentIndex, String photo, String contentText, Long likeCount, User user) {
        this.userContentIndex = userContentIndex;
        this.photo = photo;
        this.contentText = contentText;
        this.likeCount = likeCount;
        this.user = user;
    }
}
