package hhh.hestagram.Follow;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class FollowPK implements Serializable {

    private Long user;
    private Long user2;
}
