package hhh.hestagram.Content;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
import hhh.hestagram.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema="hestagram", name="Content")
public class Content extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    /*@Column(name = "user_index", nullable = false)
    private Long userIndex;*/

    @Column(name = "user_content_index", nullable = false)
    private Long userContentIndex;

    @Column(name = "photo")
    private String photo;

    /*@Column(name = "update_time")
    private Date updateTime;*/

    @Column(name = "content_text")
    @ColumnDefault("null")
    private String contentText;

    @Column(name = "like_count")
    @ColumnDefault("0")
    private Long likeCount;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name="user_index")
    private User user;
}
