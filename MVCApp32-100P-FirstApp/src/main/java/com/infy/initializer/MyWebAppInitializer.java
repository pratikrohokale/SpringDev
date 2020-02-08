package com.infy.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.infy.config.RootAppConfig;
import com.infy.config.WebMvcAppConfig;

public class MyWebAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootCtx = null, webCtx = null;
		ContextLoaderListener loaderListner = null;
		DispatcherServlet servlet = null;

		// createRootContainer
		rootCtx = new AnnotationConfigWebApplicationContext();
		rootCtx.register(RootAppConfig.class);

		// createChildContainer
		webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.register(WebMvcAppConfig.class);

		loaderListner = new ContextLoaderListener(rootCtx);
		servletContext.addListener(loaderListner);

		servlet = new DispatcherServlet(webCtx);
		ServletRegistration.Dynamic regiDynamic = servletContext.addServlet("dispatcher", servlet);

		regiDynamic.setLoadOnStartup(2);
		regiDynamic.addMapping("*.htm");

	}

}
