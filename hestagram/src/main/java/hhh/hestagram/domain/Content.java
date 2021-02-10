package hhh.hestagram.domain;

public class Content {
    private Long contentIndex;
    private Long userIndex;
    private Long userContentIndex;
    private String photo;
    private String updateTime;
    private String contentText;
    private Long likeCount;

    public Long getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Long contentIndex) {
        this.contentIndex = contentIndex;
    }

    public Long getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(Long userIndex) {
        this.userIndex = userIndex;
    }

    public Long getUserContentIndex() {
        return userContentIndex;
    }

    public void setUserContentIndex(Long userContentIndex) {
        this.userContentIndex = userContentIndex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }
}
