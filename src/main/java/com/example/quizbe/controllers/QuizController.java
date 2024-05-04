package com.example.quizbe.controllers;

import com.example.quizbe.domain.quiz.RequestQuizDto;
import com.example.quizbe.services.QuizService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping
    public ResponseEntity<?> getAllQuiz() {
        return ResponseEntity.ok(quizService.getAllQuiz());
    }

    @PostMapping
    public ResponseEntity<?> createQuiz(@RequestBody @Valid RequestQuizDto data) {
        return ResponseEntity.ok(quizService.createQuiz(data));
    }
}
