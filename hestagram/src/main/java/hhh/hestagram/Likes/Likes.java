package hhh.hestagram.Likes;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
import hhh.hestagram.Content.Content;
import hhh.hestagram.Follow.FollowPK;
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
@Table(schema="hestagram", name="Likes")
@IdClass(LikesPK.class)
@DynamicInsert
public class Likes extends BaseTimeEntity {
    @Id
    @ManyToOne(targetEntity = Content.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "content_index") // FK
    private Content content; // PK

    @Id
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_index")
    private User user;
}
