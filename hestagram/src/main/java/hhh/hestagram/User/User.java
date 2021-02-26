package hhh.hestagram.User;
import hhh.hestagram.Content.Content;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.List;

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
    @ColumnDefault("null")
    private String profilePicture;

    @Column(name = "description")
    @ColumnDefault("null")
    private String description;

    @OneToMany(mappedBy = "user")
    private List<Content> contentList;

    @Override
    public String toString() {
        return "User{" +
                "userIndex=" + userIndex +
                ", nickname='" + nickname +
                ", password=" + password +
                ", phone=" + phone +
                ", email=" + email +
                ", name=" + name +
                ", id=" + id +
                "\nprofile_picture=" + profilePicture +
                ", description=" + description +
                '}';
        // System.out.println("order = " + order); 로 객체 호출 시에 이 함수(toString) 호출
    }

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

