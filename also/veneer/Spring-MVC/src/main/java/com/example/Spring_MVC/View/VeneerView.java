package com.example.Spring_MVC.View;

import java.util.Map;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

import com.example.Spring_MVC.utils.RenderContext;
import com.example.Spring_MVC.utils.VeneerSupport;

/**
 * 커스텀 뷰 처리 클래스
 */
public class VeneerView implements View {
    private String name; // 뷰 파일 이름

    public VeneerView(String name) {
        this.name = name;
    }

    @Override
    public String getContentType() {
        return "text/html";
    }

    /**
     * 뷰를 렌더링하는 메서드
     */
    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 모델 데이터를 request 속성으로 설정
        if (model != null) {
            for (Map.Entry<String, ?> modelEntry : model.entrySet()) {
                request.setAttribute(modelEntry.getKey(), modelEntry.getValue());
            }
        }

        // 렌더링 컨텍스트 생성 후 뷰를 렌더링
        RenderContext renderContext = VeneerSupport.getContext(request.getServletContext(), request);
        String value = renderContext.renderMain(response, name);

        if (value != null) {
            response.getWriter().write(value);
        }
    }
}