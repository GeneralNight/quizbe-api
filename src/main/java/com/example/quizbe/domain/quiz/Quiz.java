package com.example.quizbe.domain.quiz;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "quiz")
@Entity(name = "quiz")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    public Quiz(RequestQuizDto requestQuizDto) {
        this.name = requestQuizDto.name();
    }
}
