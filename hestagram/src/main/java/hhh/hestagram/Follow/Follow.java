package hhh.hestagram.Follow;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(schema="hestagram", name="Follow")
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_index", nullable = false)
    private Long userIndex;

    @Column(name = "following_index", nullable = false)
    private  Long followingIndex;
}
