package com.example.blog.service;

import com.example.blog.dto.PostDto;
import com.example.blog.mapper.PostMapper;
import com.example.blog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    private final PostMapper postMapper;

    @Override
    public List<PostDto> findAllPosts() {
        return postRepository.findAll().stream()
                .map(postMapper::mapToPostDto)
                .collect(Collectors.toList());
    }
}
