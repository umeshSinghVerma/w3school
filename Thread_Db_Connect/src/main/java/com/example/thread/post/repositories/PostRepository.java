package com.example.thread.post.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thread.post.model.Post;

public interface PostRepository extends JpaRepository<Post, String> {
    Post findByPostId(String postId);
}
