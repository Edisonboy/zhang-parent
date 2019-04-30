package com.zhang.zhang.practice.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableApolloConfig
public class ZhangPracticeApolloApplication {

    @Value("${timeout}")
    private int batch;

    static {
        System.setProperty("-Denv","dev");
    }

    public static void main(String[] args) {
        SpringApplication.run(ZhangPracticeApolloApplication.class, args);
    }

    @GetMapping("/test")
    public int test() {
        return batch;
    }

}
