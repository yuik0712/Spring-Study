package com.example.Spring_MVC.utils;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 뷰 렌더링을 위한 컨텍스트 관리 클래스
public class RenderContext {
    private final ServletContext servletContext;
    private final HttpServletRequest request;

    public RenderContext(ServletContext servletContext, HttpServletRequest request) {
        this.servletContext = servletContext;
        this.request = request;
    }

    // 주어진 뷰 파일을 렌더링하는 메서드
    public String renderMain(HttpServletResponse response, String viewPath) {
        try {
            // 지정된 뷰 경로를 가져와 forward 처리
            request.getRequestDispatcher(viewPath).forward(request, response);
            return null; // forward 후에는 직접 응당읍 처리하지 않음
        } catch (Exception e) {
            e.printStackTrace();
            return "<h1>Error Rendering View</h1>";
        }
    }
}