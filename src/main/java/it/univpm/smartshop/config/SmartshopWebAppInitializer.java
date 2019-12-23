package it.univpm.smartshop.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SmartshopWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
	return new Class<?>[] { DataServiceConfig.class,  };
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses()
    {
	return new Class<?>[] { WebConfig.class };
    }

    @Override
    protected String[] getServletMappings()
    {
	return new String[] { "/" };
    }
    
}
