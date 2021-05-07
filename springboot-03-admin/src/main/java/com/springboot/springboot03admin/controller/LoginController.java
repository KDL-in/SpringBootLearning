package com.springboot.springboot03admin.controller;

import com.springboot.springboot03admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @GetMapping(value = {"/", "/index"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String index(User user, HttpSession session, Model model){
        if ("admin".equals(user.getName()) && "123456".equals(user.getPasswd())) {
            session.setAttribute("user", user);
            return "redirect:/index.html";
        }
        model.addAttribute("msg", "用户密码错误");
        return "login";
    }

    @GetMapping("/index.html")
    public String indexPage(HttpSession session,Model model) {
        if (session.getAttribute("user")!=null)
            return "index";
        model.addAttribute("msg", "请重新登录");
        return "login";
    }

}
