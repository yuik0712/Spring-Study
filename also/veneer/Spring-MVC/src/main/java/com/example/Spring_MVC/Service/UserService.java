package com.example.Spring_MVC.Service;

import com.example.Spring_MVC.Model.User;
import org.springframework.stereotype.Service;

// 사용자 정보를 처리하는 서비스 클래스
@Service
public class UserService {

    // User 객체 반환 (예제용, 실제 DB 연동 시 Repository 사용)
    public User getUser() {
        return new User("John Doe", "john.doe@example.com");
    }
}
