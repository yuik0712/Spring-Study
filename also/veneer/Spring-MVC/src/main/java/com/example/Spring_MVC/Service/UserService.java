package com.example.Spring_MVC.Service;

import com.example.Spring_MVC.Model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        return new User("Yuik", "geomeunsaja0920@naver.com");
    }
}
