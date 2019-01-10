package cn.mini523.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
class PlatApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication_8001.class);
    }
}
