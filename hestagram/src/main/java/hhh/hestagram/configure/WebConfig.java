package hhh.hestagram.configure;

import com.amazonaws.HttpMethod;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000", "http://localhost:3000")
                .allowedMethods(HttpMethod.POST.name())
                .allowCredentials(false)
                .exposedHeaders("jwt-token");	//make client read header("jwt-token")
    }
}
