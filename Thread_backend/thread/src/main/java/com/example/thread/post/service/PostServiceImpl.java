package com.example.thread.post.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thread.post.model.Post;

@Service
public class PostServiceImpl implements PostService {
    private ArrayList<Post> posts = new ArrayList<>();

    // Post(Long postId, desc, String imageUrl)
    public PostServiceImpl() {
        posts.add(new Post(1,
                "Spring Boot is an open source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production ready spring applications. ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3zQA0LvGZmxjISx088MacaaeIZxw0vpSekQ&usqp=CAU"));
        posts.add(new Post(2,
                "Node.js is a very powerful JavaScript-based platform built on Google Chrome's JavaScript V8 Engine. It is used to develop I/O intensive web applications like video streaming sites, single-page applications, and other web applications. ",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2EXblS96Akz6p_rbc1nwFuhsjf9VNUmwGow&usqp=CAU"));
        posts.add(new Post(3,
                "Bard is a conversational generative artificial intelligence chatbot developed by Google, based initially on the LaMDA family of large language models and later the PaLM LLM",
                "https://static1.xdaimages.com/wordpress/wp-content/uploads/2023/03/google-bard-feature-image.png"));
        posts.add(new Post(4,
                "दौलत तो विरासत में मिल सकती है, लेकिन पहचान अपने दम पर बनानी पड़ती है !",
                "https://iilsindia.com/blogs/wp-content/uploads/2017/10/success.jpg"));
        posts.add(new Post(5,
                "hlo ",
                "https://emoovio.com/wp-content/uploads/2020/09/Emotional-Quotes.jpg"));

    }

    @Override
    public List<Post> getAllPosts() {
        return posts;
    }

    @Override
    public Post getPostById(int postId) {
        for (Post post : posts) {
            if (post.getPostId() == (postId)) {
                return post;
            }
        }
        return null;
    }

    @Override
    public boolean deletePostById(int postId) {
        for (Post post : posts) {
            if (post.getPostId() == (postId)) {
                posts.remove(post);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Post> addPost(Post post) {
        posts.add(post);
        return posts;
    }

}
