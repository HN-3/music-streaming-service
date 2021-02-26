package hhh.hestagram.Follow;

import hhh.hestagram.User.User;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(schema="hestagram", name="Follow")
@IdClass(FollowPK.class)
@DynamicInsert
public class Follow {
    @Id
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_index")
    private User user;

    @Id
    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "following_index")
    private User user2;
}
