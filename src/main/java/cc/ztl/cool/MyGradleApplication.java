package cc.ztl.cool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Taylor
 */
@SpringBootApplication
//@EnableScheduling
@MapperScan("cc.ztl.cool.user.dao")
public class MyGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyGradleApplication.class, args);
    }

}
