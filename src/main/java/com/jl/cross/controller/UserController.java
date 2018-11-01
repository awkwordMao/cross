package com.jl.cross.controller;

import com.jl.cross.model.User;
import com.jl.cross.service.UserService;
import com.jl.cross.util.MD5Util;
import com.jl.cross.util.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin2.message.Message;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public Result<User> regist(@PathParam("name") String name, @PathParam("pssword") String password) throws NoSuchAlgorithmException {
        String mdPassword = MD5Util.encodeByMD5(password);
        System.out.println(mdPassword);
        Result<User> result = new Result<User>();
        User user = new User();
        user.setName(name);
        user.setPassword(mdPassword);
        result = userService.regist(user);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<User> login(@PathParam("name") String name, @PathParam("password") String password, HttpServletRequest request){
//        System.out.println(name + "=======" + password);
        String mdPassword = MD5Util.encodeByMD5(password);
        Result<User> result = userService.login(name, mdPassword, request);
        return result;
    }

    @ResponseBody
    @RequestMapping("/hello/{id}")
    public Result hello(@PathVariable("id") String id){
        Result result = new Result();
        result.setStatus(1);
        result.setMsg(id);
        System.out.println(result);
        return result;
    }
}
