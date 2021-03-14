package hhh.hestagram.hashtag;

import hhh.hestagram.Content.Content;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class HashtagSaveDto {
    private String tagText;
    private Content content;

    @Builder
    public HashtagSaveDto(String tagText, Content content) {
        this.tagText = tagText;
        this.content = content;
    }

    public Hashtag toEntity() {
        return Hashtag.builder()
                .tagText(tagText)
                .content(content)
                .build();
    }
}
