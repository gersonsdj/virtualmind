package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findByTopic(Topic topic);
  List<Post> findByTitle(String title);

  Post findById(long id);
}

// to save the Post, simply use (PostRepository)repository.save(new Post((Topic)topic,"title","text"))