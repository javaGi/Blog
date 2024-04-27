package com.blog.payload;

import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private long id;
    @NotEmpty
    @Size(min = 2,message = "the Title should be at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 2,message = "The Description should be at least 2 characters")
    private String description;

    @NotEmpty
    @Size(min = 2,message = "the Content should be at least 2 characters")
    private String content;



}
