package com.example.Spring_MVC.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// User 엔티티 클래스 (데이터 모델)
@Getter // 객체의 필드 값을 반환하는 메서드
@Setter // 객체의 필드 값을 변환하는 메서드
@AllArgsConstructor // 생성자 자동으로 생성

public class User {
    // 접근 제어자를 사용하여 캡슐화 유지 (getter, setter로만 접근 가능)
    private String name;
    private String email;
}
