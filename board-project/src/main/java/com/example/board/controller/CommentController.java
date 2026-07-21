package com.example.board.controller;

import com.example.board.entity.Comment;
import com.example.board.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController (CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public Comment create(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping
    public List<Comment> getAll() {
        return commentService.getAllComments();
    }


}
