package hhh.hestagram.User;

import hhh.hestagram.Content.Content;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String nickname;
    private String password;
    private String phone;
    private String email;
    private String name;
    private String id;
    private String profilePicture;
    private String description;

    @Builder
    public UserDto(String nickname, String password, String phone, String email, String name, String id, String profilePicture, String description) {
        this.nickname = nickname;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.id = id;
        this.profilePicture = profilePicture;
        this.description = description;
    }

    public User toEntity() {
        return User.builder()
                .nickname(nickname)
                .password(password)
                .phone(phone)
                .email(email)
                .name(name)
                .id(id)
                .profilePicture(profilePicture)
                .description(description)
                .build();
    }
}
