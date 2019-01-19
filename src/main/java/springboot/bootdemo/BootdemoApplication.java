package springboot.bootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mapper接口类的包名 加上
@SpringBootApplication
@MapperScan("springboot.bootdemo.generratorpojo")//将项目中对应的mapper类的路径加进来就可以了
public class BootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }

}

