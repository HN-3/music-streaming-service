package hhh.hestagram.Likes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class LikesPK implements Serializable{

    private Long content;
    private Long user;

}
