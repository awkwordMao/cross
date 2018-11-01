package com.jl.cross.dao;

import com.jl.cross.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User findByName(String name);

    void insert(User user);

}
