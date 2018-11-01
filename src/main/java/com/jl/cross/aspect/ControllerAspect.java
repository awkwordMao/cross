package com.jl.cross.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Aspect
public class ControllerAspect {

//    @Pointcut("execution(public * com.jl.cross.controller.*.*(..))")
//    public void loginController(){
//    }
//
//    @Around("loginController()")
//    public void doBefore(JoinPoint joinPoint){
//        System.out.println("AOP注入Controller");
//        ServletRequestAttributes servlertRequest = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = servlertRequest.getRequest();
//
////        HttpServletResponse response =
//
//        System.out.println(request.getRequestURI());
//        String uri = request.getRequestURI();
//        if(!uri.equals("/")){
////            request.getRequestDispatcher("/").forward();
//        }
//    }

}
