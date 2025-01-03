package com.example.blog.service.article;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

  public Optional<ArticleEntity> findById(long id){
    return Optional.of(new ArticleEntity(
            id,
            "title",
            "content",
            LocalDateTime.now(),
            LocalDateTime.now()
    ));

  }
}
