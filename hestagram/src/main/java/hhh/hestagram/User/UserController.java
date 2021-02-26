package hhh.hestagram.User;

import hhh.hestagram.Content.ContentSaveRequestDto;
import hhh.hestagram.Content.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hestagram")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/join") //{name}
    public void createPost(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
