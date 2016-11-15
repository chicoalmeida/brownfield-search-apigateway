package com.brownfield.search.apigateway;

import com.brownfield.search.apigateway.filter.CustomZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin
public class BrownFieldSearchApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(BrownFieldSearchApiGatewayApplication.class, args);
    }

    @Bean
    public CustomZuulFilter customFilter() {
        return new CustomZuulFilter();
    }
}
