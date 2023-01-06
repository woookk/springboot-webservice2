package com.woookk.study.springboot.web.service;

import com.woookk.study.springboot.web.domain.Posts;
import com.woookk.study.springboot.web.dto.PostsResponseDto;
import com.woookk.study.springboot.web.dto.posts.PostsSaveRequestDto;
import com.woookk.study.springboot.web.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+ id));

        return new PostsResponseDto(entity);
    }
}

