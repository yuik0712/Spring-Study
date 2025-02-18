package com.example.Spring_MVC.Controller;

import com.example.Spring_MVC.Model.User;
import com.example.Spring_MVC.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // JSON을 반환하는 컨트롤러
@RequestMapping("/api") // 공통 경로 설정
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")  // URL: http://localhost:8080/api/user
    public User getUser() {
        return userService.getUser(); // JSON 반환
    }
}
