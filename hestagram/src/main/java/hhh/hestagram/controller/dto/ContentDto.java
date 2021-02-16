package hhh.hestagram.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContentDto {
    private Long userIndex;
    private Long userContentIndex;
    private String photo;
    private Date updateTime;
    private String contentText;
    private Long likeCount;
}
