package com.example.service;

import java.util.List;

public interface RoleService {
    List<Role> list();

    void save(Role role);
}
