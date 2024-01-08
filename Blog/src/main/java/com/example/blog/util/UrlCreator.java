package com.example.blog.util;

import org.springframework.stereotype.Component;

@Component
public class UrlCreator {

    public String getUrl(String postTitle) {
        String title = postTitle.trim().toLowerCase();
        String url = title.replaceAll("\\s+", "-");
        url = url.replaceAll("[^A-Za-z0-9]", "-");
        return url;
    }

}
