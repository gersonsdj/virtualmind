package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.virtualmind.example.jpa.Topic;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "topic_id")
  private Topic topic;

  private String title;
  private String text;

  protected Post() {}

  public Post(Topic topic, String title, String text) {
    this.topic = topic;
    this.title = title;
    this.text = text;
  }

  //getter and setter

}