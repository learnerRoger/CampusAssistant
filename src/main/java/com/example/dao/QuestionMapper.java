package com.example.dao;

import com.example.domain.TbQuestions;

import java.util.List;

public interface QuestionMapper {
    List<TbQuestions> findAll();
}
