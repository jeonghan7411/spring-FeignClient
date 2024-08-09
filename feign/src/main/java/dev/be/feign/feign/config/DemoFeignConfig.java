package dev.be.feign.feign.config;


import dev.be.feign.feign.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//DemoClient 에서만 유효한 설정
@Configuration
public class DemoFeignConfig {


    //interceptor 빈등록해야 사용이 가능하다
    @Bean
    public DemoFeignInterceptor feignInterceptor(){
        return DemoFeignInterceptor.of();
    }
}
