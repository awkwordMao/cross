package com.jl.cross.service;

import com.jl.cross.model.User;
import com.jl.cross.util.Result;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    Result<User> login(String name, String password, HttpServletRequest request);

    Result<User> regist(User user);

}
