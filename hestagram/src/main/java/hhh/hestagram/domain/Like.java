package hhh.hestagram.domain;

public class Like {

    private Long contentIndex;
    private Long userIndex;
    private String commitTime;

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

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }
}
