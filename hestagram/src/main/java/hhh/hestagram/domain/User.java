package hhh.hestagram.domain;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(schema="hestagram", name="User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_index", nullable = false)
    private Long userIndex;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "description")
    private String description;

    @Builder
    public User(String nickname, String password, String phone, String email,
                String name, String id, String profilePicture, String description) {
        this.nickname = nickname;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.id = id;
        this.profilePicture = profilePicture;
        this.description = description;
    }
}

