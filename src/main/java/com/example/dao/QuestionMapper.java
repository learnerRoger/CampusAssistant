package com.example.dao;

import com.example.domain.TbQuestions;

import java.util.List;

public interface QuestionMapper {
    List<TbQuestions> findAll();
    void removeQuestion(String q_id);

    void addQuestion(TbQuestions tbQuestions);
}
