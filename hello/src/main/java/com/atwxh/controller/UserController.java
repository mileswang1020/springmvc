package com.atwxh.controller;

import com.atwxh.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static List<User> userList;
    public UserController() {
        super();
        userList = new ArrayList<User>();
    }

    @GetMapping(value = "/register")
    public String registerForm() {
        System.out.println("register GET 方法被调用...");
        return "registerForm";
    }

    @PostMapping(value = "/register")
    public String register(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            @RequestParam("username") String username) {
        System.out.println("register POST 方法被调用...");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);

        userList.add(user);
        return "loginForm";
    }

    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model) {
        System.out.println("登录名："+loginname + " 密码："+ password);
        for (User user: userList) {
            if (user.getLoginname().equals(loginname) && user.getPassword().equals(password)) {
                model.addAttribute("user", user);
                return "welcome";
            }
        }
        return "loginForm";
    }
}
