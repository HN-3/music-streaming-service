package hhh.hestagram.User;

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
}
