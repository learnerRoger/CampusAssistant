package com.example.service;

import com.example.dao.FoundNoticeMapper;
import com.example.dao.UserMapper;
import com.example.domain.TbFoundNotice;
import com.example.domain.TbUsers;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foundNoticeService")
public class FoundNoticeServiceImpl {
    @Autowired
    private ConfigService configService;


    public void addFoundNotice(TbFoundNotice tbFoundNotice) throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        FoundNoticeMapper foundNoticeMapper = sqlSession.getMapper(FoundNoticeMapper.class);
        foundNoticeMapper.addFoundNotice(tbFoundNotice);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<TbFoundNotice> findAll() throws Exception {
        SqlSession sqlSession = configService.returnSqlSession();
        FoundNoticeMapper foundNoticeMapper =sqlSession.getMapper(FoundNoticeMapper.class);
        List<TbFoundNotice> tbFoundNoticeList = foundNoticeMapper.findAll();
        return tbFoundNoticeList;
    }
}
