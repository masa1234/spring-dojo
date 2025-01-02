package com.example.blog.web.controller.article;

import com.example.blog.service.article.ArticleService;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
public class ArticleRestController {

  private final ArticleService articleService;

  //Get /articles/a
  @GetMapping("/articles/{id}")
  public ArticleDTO showArticle(@PathVariable("id") long id){
    return articleService.findById(id)
        .map(ArticleDTO::from)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

}
