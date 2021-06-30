package com.example.mydevboard.domain.dto;

import com.example.mydevboard.domain.post.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostSimpleResponseDto {
    private Long id;
    private String title;
    private String writer;

    public PostSimpleResponseDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.writer = post.getWriter();

    }
}
