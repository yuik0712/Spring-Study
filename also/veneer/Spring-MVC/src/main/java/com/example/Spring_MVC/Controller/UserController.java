package com.example.Spring_MVC.Controller;

import com.example.Spring_MVC.Model.User;
import com.example.Spring_MVC.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 사용자 정보를 처리하는 컨트롤러 클래스
@Controller
public class UserController {
    private final UserService userService;

    // 생성자 주입 방식 (의존성 주입)
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // "/user" 경로로 GET 요청이 들어오면 사용자 정보를 조회하여 뷰에 전달
    @GetMapping("/user")
    public String getUser(Model model) {
        User user = userService.getUser();
        model.addAttribute("user", user); // 뷰에 전달할 데이터 추가
        return "userProfile"; // "userProfile.html" 뷰로 이동
    }
}