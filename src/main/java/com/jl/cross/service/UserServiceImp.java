package com.jl.cross.service;

import com.jl.cross.dao.UserDao;
import com.jl.cross.model.User;
import com.jl.cross.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Result<User> login(String name, String password, HttpServletRequest request) {
        Result<User> result = new Result<User>();
        User user = userDao.findByName(name);
//        System.out.println(user);
        if(user == null){
            result.setStatus(1);
            result.setMsg("用户不存在");
            return result;
        }
        if(!user.getPassword().equals(password)){
            result.setStatus(1);
            result.setMsg("密码错误");
            return result;
        }
        result.setStatus(0);
        result.setMsg("登陆成功");
        request.getSession().setAttribute("name", name);
//        System.out.println(request.getSession().getAttribute("name"));
        return result;
    }

    @Override
    public Result<User> regist(User user) {
        Result<User> result = new Result<User>();
        User user1 = userDao.findByName(user.getName());
        if(user1 != null){
            result.setStatus(1);
            result.setMsg("该用户名已被使用");
            return result;
        }
        userDao.insert(user);
        result.setStatus(0);
        result.setMsg("注册成功");
        return result;
    }
}
