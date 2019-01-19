package springboot.bootdemo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootdemoApplicationTests {

    @Test
    public void contextLoads() {
        String a="68:F2:95:65:09:17:0D:87:F7:C0:EB:9F:50:5B:06:18:C0:23:CE:38";
        System.out.println(a.replace(":",""));


//        String resource = "org/mybatis/example/mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        System.out.println("----------1111111111111111------------------");
    }
    @Before
    public void befores(){
        System.out.println("----------111111111befores1111111------------------");
    }
    @BeforeClass
    public static void BeforeClass(){
        System.out.println("----------111111111BeforeClass1111111------------------");
    }

}

