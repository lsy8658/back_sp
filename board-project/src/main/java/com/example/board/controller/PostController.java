package com.example.board.controller;

import com.example.board.entity.Post;
import com.example.board.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController (PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post create(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping
    public List<Post> getAll() {
        return postService.getAllPosts();
    }

    @PutMapping("/{id}")
    public Post update (@PathVariable("id") Long id, @RequestBody Post postDetails) {
       return postService.updatePost(id, postDetails);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        postService.deletePost(id);
    }
}
