package com.example.blog.web.controller.article;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleRestController {

  //Get /articles/a
  @GetMapping("/articles/{id}")
  public String showArticle(@PathVariable("id") long id){
    return "This is artice: id = " + id;
  }

}
