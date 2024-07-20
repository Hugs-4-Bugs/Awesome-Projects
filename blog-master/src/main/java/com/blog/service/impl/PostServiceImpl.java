//package com.blog.service.impl;
//
//import com.blog.entity.Post;
//import com.blog.payload.PostDto;
//import com.blog.repositories.PostRepository;
//import com.blog.service.PostService;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class PostServiceImpl implements PostService {
////    Instead of using @Autowired for injecting the Dependency we will use @ConstructorBased Injection as
//
//    private PostRepository postRepository;
//    public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//
//
//    @Override
//    public PostDto createPost(PostDto postDto){
//        Post post = new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
//
//        Post savedPost = postRepository.save(post);
//
//        PostDto dto = new PostDto();
//        dto.setId(savedPost.getId());
//        dto.setTitle(savedPost.getTitle());
//        dto.setDescription(savedPost.getDescription());
//        dto.setContent(savedPost.getContent());
//        return dto;
//    }
//}
