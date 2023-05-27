package com.example.thread.post.model;

public class Post {
    private int postId;
    private String userId="harshitchordia21";
    private String userName="Harshit Pralay Chordiya";
    private String profileUrl="https://avatars.githubusercontent.com/u/119834957?v=4";
    private String desc;
    private String imageUrl;

    public Post() {
        super();
        
    }

    public Post(int postId, String userId, String userName, String profileUrl, String desc, String imageUrl) {
        this.postId = postId;
        this.userId = userId;
        this.userName = userName;
        this.profileUrl = profileUrl;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public Post(int postId, String desc, String imageUrl) {
        this.postId = postId;
        this.desc = desc;
        this.imageUrl = imageUrl;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
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

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
