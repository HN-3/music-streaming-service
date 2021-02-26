package hhh.hestagram.User;

public interface UserService {

    void saveUser(UserDto userDto);
    void deleteByUserIndex(Long userIndex);

    User updateByUserIndex(User updateUserValue);
}
