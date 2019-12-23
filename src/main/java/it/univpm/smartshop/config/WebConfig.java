package it.univpm.smartshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
//-- Abilitazione del conponent-Scannig i package sotto questa annotazione vengono scannerizati per la ricerca classi con annotazione @Component
@ComponentScan( basePackages = { "it.univpm.smartshop"} )
public class WebConfig implements WebMvcConfigurer
{

    @Bean
    public ViewResolver viewResolver()
    {
	/*Configirazone del VIEW resolver */
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	
	resolver.setPrefix("/WEB-INF/");
	resolver.setSuffix(".jsp");
	resolver.setExposeContextBeansAsAttributes(true);
	
	return resolver;
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
	configurer.enable();
	
    }
   
}
