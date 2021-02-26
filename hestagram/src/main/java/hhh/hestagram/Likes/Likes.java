package hhh.hestagram.Likes;

import hhh.hestagram.User.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema="hestagram", name="Likes")
public class Likes {
    @Id
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    /*@Column(name = "user_index", nullable = false)
    private Long userIndex;*/

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_index")
    private User user;
}
