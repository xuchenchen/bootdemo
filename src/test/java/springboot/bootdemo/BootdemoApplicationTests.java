package springboot.bootdemo;

import org.apache.commons.codec.digest.DigestUtils;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.bootdemo.util.MD5Util;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootdemoApplicationTests {

    @Autowired
    StringEncryptor stringEncryptor;
    @Test
    public void encPswd(){
        String encodeStr=DigestUtils.md5Hex("com.ryx.managercardMTAwMDAwMDAxMDAwMjI=");
        System.out.println("MD5加密后的字符串为:encodeStr="+encodeStr);
        String encodeStr2=MD5Util.Md5Andr("com.ryx.managercardMTAwMDAwMDAxMDAwMjI=");
        System.out.println("MD5加密后的字符串为:encodeStr2="+encodeStr2);
//        System.out.println("加密==="+stringEncryptor.encrypt("jdbc:mysql://localhost:3306/mybatis001?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8")) ;
    }

//    @Test
//    public void contextLoads() {
//        String a="68:F2:95:65:09:17:0D:87:F7:C0:EB:9F:50:5B:06:18:C0:23:CE:38";
//        System.out.println(a.replace(":",""));
//
//
////        String resource = "org/mybatis/example/mybatis-config.xml";
////        InputStream inputStream = null;
////        try {
////            inputStream = Resources.getResourceAsStream(resource);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
////        System.out.println("----------1111111111111111------------------");
//    }
//    @Before
//    public void befores(){
//        System.out.println("----------111111111befores1111111------------------");
//    }
//    @BeforeClass
//    public static void BeforeClass(){
//        System.out.println("----------111111111BeforeClass1111111------------------");
//    }

}

