package com.example.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String url;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(name = "short descriptions")
    private String shortDescription;

    @CreationTimestamp
    @Column(name = "date time created")
    private LocalDateTime createdOn;

    @UpdateTimestamp
    @Column(name = "date dime updated")
    private LocalDateTime updatedOn;
}
