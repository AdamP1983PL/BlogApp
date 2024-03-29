package com.example.blog.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDto {

    private Long id;

    @NotEmpty(message = "Post Title should not be empty.")
    private String title;

    private String url;

    @NotEmpty(message = "Post Content should not be empty.")
    private String content;

    @NotEmpty(message = "Post Short Description should not be empty.")
    private String shortDescription;

    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;

}
