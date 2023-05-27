package com.example.thread.post.service;

import java.util.List;

import com.example.thread.post.model.Post;

public interface PostService {

    public List<Post> getAllPosts();

    public Post getPostById(int postId);

    public boolean deletePostById(int postId);

    // public void addPost(Post post);
    public List<Post> addPost(Post post);
}