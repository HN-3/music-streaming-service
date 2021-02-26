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

    @Builder
    public UserDto(String nickname, String password, String phone, String email, String name, String id) {
        this.nickname = nickname;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public User toEntity() {
        return User.builder()
                .nickname(nickname)
                .password(password)
                .phone(phone)
                .email(email)
                .name(name)
                .id(id)
                .build();
    }
}
