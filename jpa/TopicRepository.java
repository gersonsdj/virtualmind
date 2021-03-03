package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {

  List<Topic> findByName(String name);

  Topic findById(long id);
}

// to save the Topic, simply use (TopicRepository)repository.save(new Topic("name"))