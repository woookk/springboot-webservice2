package com.woookk.study.springboot.web.controller;

import com.woookk.study.springboot.web.dto.posts.PostsResponseDto;
import com.woookk.study.springboot.web.dto.posts.PostsSaveRequestDto;
import com.woookk.study.springboot.web.dto.posts.PostsUpdateRequestDto;
import com.woookk.study.springboot.web.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsController {
    private final PostsService postsService;

    @PostMapping("/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {

        return postsService.save(requestDto);
    }

    @GetMapping("/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }

    @PutMapping("/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody
    PostsUpdateRequestDto requestDto) {

        return postsService.update(id, requestDto);
    }
}
