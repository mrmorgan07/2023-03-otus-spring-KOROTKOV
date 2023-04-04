package ru.mskorotkov.spring.dao;

import ru.mskorotkov.spring.domain.Question;

import java.util.List;

public class QuestionDaoImpl implements QuestionDao{

    public Question getQuestion(List<String> list) {
        return new Question(list);
    }
}
