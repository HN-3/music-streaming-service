package hhh.hestagram.hashtag;


import hhh.hestagram.Content.Content;
import hhh.hestagram.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema="hestagram", name="Hashtag")
@DynamicInsert
public class Hashtag {

    @Id
    @Column(name = "tag_text", nullable = false)
    private String tagText;

    @ManyToOne(targetEntity = Content.class, fetch = FetchType.LAZY)
    @JoinColumn(name="content_index")
    private Content content;
}
