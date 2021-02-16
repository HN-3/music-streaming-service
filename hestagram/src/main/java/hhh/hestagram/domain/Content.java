package hhh.hestagram.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(schema="hestagram", name="Content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    @Column(name = "user_index", nullable = false)
    private Long userIndex;

    @Column(name = "user_content_index", nullable = false)
    private Long userContentIndex;

    @Column(name = "photo")
    private String photo;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "content_text")
    private String contentText;

    @Column(name = "like_count")
    private Long likeCount;
}
