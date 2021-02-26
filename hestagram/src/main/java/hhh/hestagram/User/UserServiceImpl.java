package hhh.hestagram.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) { this.userRepository = userRepository; }

    @Override
    public void saveUser(UserDto userDto) { userRepository.save(userDto.toEntity()); }

    @Override
    public void deleteByUserIndex(Long userIndex) { userRepository.deleteById(userIndex); }

    @Override
    public User updateByUserIndex(User updateUserValue) {
        return null;
    }
}
