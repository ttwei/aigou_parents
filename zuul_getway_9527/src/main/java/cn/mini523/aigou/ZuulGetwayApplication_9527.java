package cn.mini523.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  //启用网关
public class ZuulGetwayApplication_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGetwayApplication_9527.class);
    }
}
