package my.com.touchngo.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ResourceRouterConfiguration {
    @Bean
    RouterFunction<ServerResponse> imgRouter() {
        return RouterFunctions
                .resources("/api/img/**", new ClassPathResource("static/img/"));
    }

    @Bean
    RouterFunction<ServerResponse> cssRouter() {
        return RouterFunctions
                .resources("/api/css/**", new ClassPathResource("static/css/"));
    }
}
