package com.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //In entity class we have used getters and setters but here we are using lombok annotation so, we don't need to use getters and setters. Just apply the @Data annotation from lombok automatically getters and setters will be made available.
//    lombok annotation reduce the boiler plate code which reduce the excess code of writting several
//    getter and setter method will be avoided with this annotation.

@AllArgsConstructor // It automatically creates the constructor arguments.
@NoArgsConstructor  // It will automatically creates the constructor without arguments.
@Entity
@Table(
        name = "posts",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false )
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

}
