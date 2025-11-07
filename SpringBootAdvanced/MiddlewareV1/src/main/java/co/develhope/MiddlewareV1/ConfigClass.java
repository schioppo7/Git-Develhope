package co.develhope.MiddlewareV1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigClass implements WebMvcConfigurer {

    private ApiLoggingInterceptor loggingInterceptor;
    private LegacyInterceptor legacyInterceptor;

    @Autowired
    public ConfigClass(ApiLoggingInterceptor loggingInterceptor, LegacyInterceptor legacyInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
        this.legacyInterceptor = legacyInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loggingInterceptor);
        registry.addInterceptor(legacyInterceptor);
    }
}

