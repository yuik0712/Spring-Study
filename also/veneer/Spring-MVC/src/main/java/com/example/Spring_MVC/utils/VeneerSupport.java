package com.example.Spring_MVC.utils;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;

// RenderContext를 생성하는 유틸리티 클래스
public class VeneerSupport {
    // 주어진 서블릿 컨텍스트와 요청을 기반으로 RenderContext 객체 생성
    public static RenderContext getContext(ServletContext servletContext, HttpServletRequest request) {
        return new RenderContext(servletContext, request);
    }
}
