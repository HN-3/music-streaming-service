package hhh.hestagram.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema="hestagram", name="Hashtag")
public class Hashtag {

    @Id
    @Column(name = "tag_text", nullable = false)
    private String tagText;

    @Column(name = "content_index", nullable = false)
    private Long contentIndex;
}
