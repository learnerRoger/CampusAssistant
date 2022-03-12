package com.example.service;

import com.example.dao.UserMapper;
import com.example.domain.TbUsers;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service("userService")
public class UserServiceImpl{
    @Autowired
    private ConfigService configService;



    public List<TbUsers> findAll() throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        List<TbUsers> tbUsersList = userMapper.findAll();
        return tbUsersList;
    }

    public void addUser(TbUsers tbUsers) throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        UserMapper userMapper =sqlSession.getMapper(UserMapper.class);
        userMapper.addUser(tbUsers);
        sqlSession.commit();
        sqlSession.close();
    }

    public void removeUser(String id_card) throws Exception{
        SqlSession sqlSession = configService.returnSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.removeUser(id_card);
        sqlSession.commit();
        sqlSession.close();
    }
}
