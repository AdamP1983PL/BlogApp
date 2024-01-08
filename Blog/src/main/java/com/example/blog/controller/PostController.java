package com.example.blog.controller;

import com.example.blog.dto.PostDto;
import com.example.blog.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/admin/posts")
    public String findAllPosts(Model model) {
        List<PostDto> posts = postService.findAllPosts();
        model.addAttribute("posts", posts);
        return "/admin/posts";
    }
}
