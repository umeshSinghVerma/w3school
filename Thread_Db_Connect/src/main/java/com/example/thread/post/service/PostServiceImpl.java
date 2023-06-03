package com.example.thread.post.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.thread.post.model.Post;
import com.example.thread.post.model.PostResponse;
import com.example.thread.post.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl() {
        super();
    }

    @Override
    public List<PostResponse> getAllPosts() {
        List<Post> posts = this.postRepository.findAll(Sort.by(Sort.Direction.DESC, "creationTime"));
        List<PostResponse> postResponse = new ArrayList<PostResponse>();
        for (Post post : posts) {
            postResponse.add(new PostResponse(post));
        }
        return postResponse;
    }

    @Override
    public PostResponse getPostById(String postId) {

        Post post = this.postRepository.findByPostId(postId);
        return new PostResponse(post);
    }

    @Override
    public boolean deletePostById(String postId) {
        Post post = this.postRepository.findByPostId(postId);
        if (post == null) {
            return false;
        }
        this.postRepository.delete(post);
        return true;

    }

    @Override
    public List<PostResponse> addPost(Post post) {
        LocalDateTime creationTime = LocalDateTime.now();
        post.setCreationTime(creationTime);
        post.setPostId(post.getUserId() + "__" + PostServiceImpl.getAlphaNumericString(10));
        this.postRepository.save(post);
        List<Post> posts = this.postRepository.findAll(Sort.by(Sort.Direction.DESC, "creationTime"));
        List<PostResponse> postResponse = new ArrayList<PostResponse>();
        for (Post post1 : posts) {
            postResponse.add(new PostResponse(post1));
        }
        return postResponse;

    }

    // function to generate a random string of length n
    static String getAlphaNumericString(int n) {

        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}