package com.example.quizbe.controllers;

import com.example.quizbe.domain.quiz.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizRepository repository;

    @GetMapping
    public ResponseEntity getAllQuiz() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity createQuiz() {

        return null;
    }
}
