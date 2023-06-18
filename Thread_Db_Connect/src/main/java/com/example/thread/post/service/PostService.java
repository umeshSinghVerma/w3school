package com.example.thread.post.service;

import java.util.List;

import com.example.thread.post.model.Post;
import com.example.thread.post.model.PostResponse;

public interface PostService {
    public List<PostResponse> getAllPosts();

    public PostResponse getPostById(String postId);

    public boolean deletePostById(String postId);

    public List<PostResponse> addPost(Post post);
}
