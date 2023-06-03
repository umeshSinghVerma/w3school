package com.example.thread.post.model;

import java.time.LocalDateTime;
import java.time.Duration;

public class PostResponse {
    private String postId;
    private String userId;
    private String userName;
    private String profileImage;
    private String description;
    private String postImage;
    private String creationTime;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public PostResponse(Post post) {
        this.postId = post.getPostId();
        this.userId = post.getUserId();
        this.userName = post.getUserName();
        this.profileImage = post.getProfileImage();
        this.description = post.getDescription();
        this.postImage = post.getPostImage();
        LocalDateTime now = LocalDateTime.now();
        Duration time = Duration.between(post.getCreationTime(), now);
        if (time.toDays() > 365) {
            this.creationTime = time.toDays() / 365 + " years ago";
        } else if (time.toDays() > 31) {
            this.creationTime = time.toDays() / 31 + " months ago";
        } else if (time.toDays() > 0) {
            this.creationTime = time.toDays() / 31 + " days ago";
        } else if (time.toHours() > 0) {
            this.creationTime = time.toHours() + " hrs ago";
        } else if (time.toMinutes() > 0) {
            this.creationTime = time.toMinutes() + " min ago";
        } else if (time.toSeconds() > 10) {
            this.creationTime = time.toSeconds() + " sec ago";
        } else {
            this.creationTime = " Just Now";
        }
    }

    public PostResponse() {
        super();
    }

}
