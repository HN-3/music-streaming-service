package hhh.hestagram.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema="hestagram", name="Like")
public class Like {

    @Id
    @Column(name = "content_index", nullable = false)
    private Long contentIndex;

    @Column(name = "user_index", nullable = false)
    private Long userIndex;

    @Column(name = "commit_time")
    private Date commitTime;
}
