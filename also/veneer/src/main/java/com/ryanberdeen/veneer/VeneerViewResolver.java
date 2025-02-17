package com.ryanberdeen.veneer;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.Ordered;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import com.ryanberdeen.veneer.Configuration;
import com.ryanberdeen.veneer.VeneerSupport;

import java.util.Locale;

public class VeneerViewResolver extends WebApplicationObjectSupport implements ViewResolver, Ordered, InitializingBean {
    private int order;
    private Configuration configuration = new Configuration();

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setPrefix(String prefix) {
        configuration.setPrefix(prefix);
    }

    public void setSuffix(String suffix) {
        configuration.setSuffix(suffix);
    }

    public void setDefaultTempleate(String defaultTempleate) {
        configuration.setDefaultTemplateName(defaultTempleate);
    }

    public void afterPropertiesSet() throws Exception {
        VeneerSupport.setconfiguration(getServletContext(), configuration);
    }

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        VeneerView result = new VeneerView(viewName);
        result.setApplicationContext(getApplicationContext());
        result.setServletContext(getServletContext());
        return result;
    }
}
