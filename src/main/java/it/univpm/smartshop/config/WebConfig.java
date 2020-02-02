package it.univpm.smartshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
/**************************************************************************************************
*** Abilitazione del conponent-Scannig i package sotto questa annotazione vengono scannerizati	***
*** per la ricerca classi con annotazione @Component						***
**************************************************************************************************/
@ComponentScan( basePackages = { "it.univpm.smartshop" } )
public class WebConfig implements WebMvcConfigurer
{

    @Bean 
    StandardServletMultipartResolver multipartResolver()
    {
	return new StandardServletMultipartResolver();
    }
    
    /**************************************************************
    ***		Gestione delle VIEWS				***
    **************************************************************/
    @Bean
    public ViewResolver viewResolver()
    {
	//Configirazone del VIEW resolver
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	
	resolver.setPrefix("/WEB-INF/views/");
	resolver.setSuffix(".jsp");
	resolver.setExposeContextBeansAsAttributes(true);
	
	return resolver;
    }


/*
    @Bean
    public TilesConfigurer tileConfigurer()
    {
	TilesConfigurer tiles = new TilesConfigurer();
	tiles.setDefinitions(new String[] {
						"/WEB-INF/layouts/tiles.xml"
                                		,"/WEB-INF/views/views.xml"
                                		,"/WEB-INF/views/*views.xml"
					  });
	tiles.setCheckRefresh(true);
	
	return tiles;
    }
*/
/*    
    @Bean
    public ViewResolver viewResolver()
    {
	return new TilesViewResolver();
    }
    
    @Bean
    UrlBasedViewResolver tilesViewResolver()
    {
	UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
	tilesViewResolver.setViewClass(TilesView.class);
	
	return tilesViewResolver;
    }
*/

    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
	configurer.enable();
    }
   
}
