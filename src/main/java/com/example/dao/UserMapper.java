package com.example.dao;


import com.example.domain.TbUsers;

import java.util.List;

public interface UserMapper {
    List<TbUsers> findAll();

    void addUser(TbUsers tbUsers);

    void removeUser(String id_card);
}
