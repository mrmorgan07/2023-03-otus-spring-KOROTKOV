package ru.mskorotkov.spring.dao;

import ru.mskorotkov.spring.domain.Question;

import java.util.List;

public interface QuestionDao {
    Question getQuestion(List<String> list);
}
