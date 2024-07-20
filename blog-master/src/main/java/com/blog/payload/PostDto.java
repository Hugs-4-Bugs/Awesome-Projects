package com.blog.payload;

import lombok.Data;



@Data // we can also use @Getter and @Setter instead we have used @Data annotation

public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
}
