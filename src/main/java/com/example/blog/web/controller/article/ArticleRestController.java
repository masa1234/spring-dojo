package com.example.blog.web.controller.article;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleRestController {

  //Get /articles/a
  @GetMapping("/articles/{id}")
  public ArticleDTO showArticle(@PathVariable("id") long id){
    return new ArticleDTO(id,
        "this is title : "+id,
        "this is content",
        LocalDateTime.now(),
        LocalDateTime.now());
  }

}
