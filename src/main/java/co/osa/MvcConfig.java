package co.osa;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by robertgreathouse on 2/17/16.
 */
@Configuration
@ComponentScan("co.osa")
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurationSupport {
    /*@Bean(name="jsonTemplate")
    public View jsonTemplate() {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        view.setPrettyPrint(true);
        return view;
    }

    @Bean(name="viewResolver")
    public ViewResolver viewResolver() {
        return new BeanNameViewResolver();
    }*/
}
