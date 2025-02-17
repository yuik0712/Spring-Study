package com.ryanberdeen.veneer;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.View;

import com.ryanberdeen.veneer.RenderContext;
import com.ryanberdeen.veneer.VeneerSupport;

public class VeneerView extends WebApplicationObjectSupport implements View {

    private String name;

    public VeneerView(String name) {
        this.name = name;
    }

    public String getContentType() {
        return null;
    }

    public String getPath() {
        return name;
    }

    @SuppressWarnings("unchecked")
    public void render(Map model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (model != null) {
            for (Map.Entry<String, Object> modelEntry : ((Map<String, Object>) model).entrySet()) {
                request.setAttribute(modelEntry.getKey(), modelEntry.getValue());
            }
        }

        RenderContext renderContext = VeneerSupport.getContext(getServletContext(), request);
        String value = renderContext.renderMain(response, name);

        if (value != null) {
            response.getWriter().write(value);
        }
    }
}