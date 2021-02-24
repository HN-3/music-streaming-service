package hhh.hestagram.BaseTimeEntity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime uploadTime;

    //@LastModifiedDate
    //private LocalDateTime updateTime;
}
