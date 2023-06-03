package com.example.thread.post.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;

@Entity
@Table(name = "Post_Data")
public class Post {
    @Id
    private String postId;
    private String userId;
    private String userName;
    private String profileImage;
    private String description;
    private String postImage;

    @Column(columnDefinition = "TIMESTAMP", nullable = false, updatable = false)
    private LocalDateTime creationTime;

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

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Post(String postId, String userId, String userName, String profileImage, String description,
            String postImage, LocalDateTime creationTime) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.profileImage = profileImage;
        this.description = description;
        this.postImage = postImage;
        this.creationTime = creationTime;
    }

    public Post() {
        super();
    }

}
