// package com.example.thread.post.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// // import org.springframework.web.bind.annotation.PostMapping;
// // import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.thread.post.model.Post_old;
// import com.example.thread.post.service.PostService_old;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.DeleteMapping;

// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;

// @RestController
// @CrossOrigin
// @RequestMapping("/")
// public class PostController_old {
// @Autowired
// private PostService_old postService;

// @GetMapping("posts/")
// public List<Post_old> getAllRoles() {
// return this.postService.getAllPosts();
// }

// @CrossOrigin
// @GetMapping("posts/{postId}")
// public Post_old getRoleByName(@PathVariable int postId) {
// return this.postService.getPostById(postId);
// }

// @CrossOrigin
// @DeleteMapping("posts/{postId}")
// public ResponseEntity<String> deleteRoleById(@PathVariable int postId) {
// boolean isDeleted = this.postService.deletePostById(postId);
// if (isDeleted) {
// return new ResponseEntity<>("Post with ID " + postId + " has been deleted.",
// HttpStatus.OK);
// } else {
// return new ResponseEntity<>("Post with ID " + postId + " does not exist.",
// HttpStatus.NOT_FOUND);
// }
// }

// @CrossOrigin
// @PostMapping("posts/")
// public List<Post_old> addPost(@RequestBody Post_old post) {
// this.postService.addPost(post);
// return this.postService.getAllPosts();
// }

// }