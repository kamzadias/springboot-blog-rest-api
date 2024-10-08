package com.springboot.blog.service;

import com.springboot.blog.payload.PostResponse;
import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, Long id);
    void deletePostById(Long id);
}
