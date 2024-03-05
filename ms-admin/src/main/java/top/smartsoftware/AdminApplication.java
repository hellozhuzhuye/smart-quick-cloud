package top.smartsoftware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
@RefreshScope
@EnableFeignClients
@MapperScan("top.smartsoftware.cloud.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
//    @Value("${config}")
//    private String configInfo;

//    @RequestMapping("/adminapi/test")
//    public String test(){
//        return "Hello Admin!" + configInfo;
//    }
}
