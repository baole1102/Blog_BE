package com.example.sprint2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "blog_has_topic")
@AllArgsConstructor
@RequiredArgsConstructor
public class BlogHasTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "blog_id",referencedColumnName = "id")
    private Blog blog;

    @ManyToOne
    @JoinColumn(name = "topic_id",referencedColumnName = "id")
    private Topic topic;
}
