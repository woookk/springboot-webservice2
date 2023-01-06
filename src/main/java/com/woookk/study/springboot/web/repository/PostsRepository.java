package com.woookk.study.springboot.web.repository;

import com.woookk.study.springboot.web.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
