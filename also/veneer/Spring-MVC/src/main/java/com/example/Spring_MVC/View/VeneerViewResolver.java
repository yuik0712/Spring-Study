package com.example.Spring_MVC.View;

import java.util.Locale;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

// 커스텀 뷰 리졸버 클래스
public class VeneerViewResolver implements ViewResolver {
    private String prefix = "/WEB-INF/views/";
    private String suffix = ".html";

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    // 뷰 이름을 받아 실제 뷰 객체 반환
    @Override
    public View resolveViewName(String viewName, Locale locale) {
        return new VeneerView(prefix + viewName + suffix);
    }
}
