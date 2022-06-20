package org.edwith.webbe.calculator.config;


import javax.servlet.*;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	// Spring 기본 설정 파일 클래스를 지정한다.
	// 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[]{ApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class<?>[]{MvcConfig.class};
	}

	 @Override
	    protected String[] getServletMappings() {
	        return new String[]{"/"};
	    }

	    /*
	    필터를 설정합니다. 여기에서는 인코딩 필터를 설정하고 있습니다.
	     */
	    @Override
	    protected Filter[] getServletFilters() {
	        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
	        encodingFilter.setEncoding("UTF-8");

	        return new Filter[]{encodingFilter};
	    }


}
