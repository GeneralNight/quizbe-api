package com.example.quizbe.services;

import com.example.quizbe.domain.quiz.Quiz;
import com.example.quizbe.domain.quiz.QuizRepository;
import com.example.quizbe.domain.quiz.RequestQuizDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    public Quiz createQuiz(RequestQuizDto requestQuizDto) {
        Quiz newQuiz = new Quiz(requestQuizDto);
        return quizRepository.save(newQuiz);
    }
}
