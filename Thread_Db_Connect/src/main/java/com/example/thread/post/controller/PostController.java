package com.example.thread.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.thread.post.model.Post;
import com.example.thread.post.model.PostResponse;
import com.example.thread.post.service.PostService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin
@RequestMapping("/")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("posts/")
    public List<PostResponse> getAllRoles() {
        return this.postService.getAllPosts();
    }

    @CrossOrigin
    @GetMapping("posts/{postId}")
    public PostResponse getRoleByName(@PathVariable String postId) {
        return this.postService.getPostById(postId);
    }

    @CrossOrigin
    @DeleteMapping("posts/{postId}")
    public ResponseEntity<String> deleteRoleById(@PathVariable String postId) {
        boolean isDeleted = this.postService.deletePostById(postId);
        if (isDeleted) {
            return new ResponseEntity<>("Post with ID " + postId + " has been deleted.", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Post with ID " + postId + " does not exist.", HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @PostMapping("posts/")
    public List<PostResponse> addPost(@RequestBody Post post) {
        this.postService.addPost(post);
        return this.postService.getAllPosts();
    }

}