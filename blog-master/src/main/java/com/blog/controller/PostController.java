//package com.blog.controller;
//
//
//import com.blog.payload.PostDto;
//import com.blog.service.PostService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/posts")
//public class PostController {
//    public PostController(PostService postService) {
//        this.postService = postService;
//    }
//
//    private PostService postService;
//
//    // http:localhost:8080/api/posts
//    @PostMapping
//    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
//        PostDto dto =postService.createPost(postDto);
//        return new ResponseEntity<>(dto, HttpStatus.CREATED);  //when you select status code "CREATED", it will give the status code 202
//
//    }
//}
