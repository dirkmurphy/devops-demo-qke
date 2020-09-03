package com.prnasia.devops;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class DevopsApp {

    @Autowired
    private RestTemplateBuilder builder;

    /**
     * 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
     */
    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }


    public static void main(String[] args) {
        SpringApplication.run(DevopsApp.class, args);
    }
}
