package com.example.service;

import com.example.dao.FoundNoticeMapper;
import com.example.dao.QuestionMapper;
import com.example.domain.TbFoundNotice;
import com.example.domain.TbQuestions;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("questionService")
public class QuestionServiceImpl {
    @Autowired
    private ConfigService configService;

    public List<TbQuestions> findAll() throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        QuestionMapper questionMapper =sqlSession.getMapper(QuestionMapper.class);
        List<TbQuestions> tbQuestionsList = questionMapper.findAll();
        return tbQuestionsList;
    }

    public void addQuestion(TbQuestions tbQuestions) throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        QuestionMapper questionMapper =sqlSession.getMapper(QuestionMapper.class);
        questionMapper.addQuestion(tbQuestions);
    }

    public void removeQuestion(String q_id) throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        QuestionMapper questionMapper =sqlSession.getMapper(QuestionMapper.class);
        questionMapper.removeQuestion(q_id);
        sqlSession.commit();
        sqlSession.close();
    }
}
