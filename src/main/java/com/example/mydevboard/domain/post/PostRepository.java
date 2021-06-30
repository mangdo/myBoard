package com.example.mydevboard.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // 생성일자 기준 내림차순 정렬
    List<Post> findAllByOrderByCreatedAtDesc();
}
