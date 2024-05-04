package com.example.quizbe.domain.quiz;

import jakarta.persistence.*;

@Table(name = "quiz")
@Entity(name = "quiz")

public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
}
