package hhh.hestagram.Likes;

import hhh.hestagram.BaseTimeEntity.BaseTimeEntity;
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
@DynamicInsert
public class Likes extends BaseTimeEntity {
    @Id
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_index")
    private User user;
}
