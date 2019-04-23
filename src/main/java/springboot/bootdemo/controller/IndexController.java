package springboot.bootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springboot.bootdemo.Bean;
import springboot.bootdemo.generratorpojo.User;
import springboot.bootdemo.service.UserService;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/indexController")
public class IndexController {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    UserService userService;

    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String from;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("async")
    public void testAsync() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        logger.info("异步方法开始");
        Future<String> resultFuture=userService.asyncMethod();
       String result= resultFuture.get();
       logger.info("result==="+result);
        logger.info("异步方法结束");
        long end = System.currentTimeMillis();
        logger.info("总耗时：{} ms", end - start);
    }

    @GetMapping("sync")
    public void testSync() {
        long start = System.currentTimeMillis();
        logger.info("同步方法开始");

        userService.syncMethod();

        logger.info("同步方法结束");
        long end = System.currentTimeMillis();
        logger.info("总耗时：{} ms", end - start);
    }


    @ResponseBody
    @RequestMapping("sendSimpleEmail")
    public String sendSimpleEmail() {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo("xuchenchen-jn@ruiyinxin.com"); // 接收地址
            message.setSubject("一封简单的邮件"); // 标题
            message.setText("使用Spring Boot发送简单邮件。"); // 内容
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @ResponseBody
    @RequestMapping("/queryALL")
    public String queryALL(){
        Map map=new HashMap();
        List<String> stringList=new ArrayList<>();
        stringList.add("152");
        stringList.add("1212");
        map.put("terminalNos",stringList);
       List<User> userList= userService.selectUsers(map);
        return userList.toString();
    }

    @ResponseBody
    @RequestMapping("/insertData")
    public String insertData(){
        User user=new User(1212,"username","pswd","15888888888");
        userService.insert(user);
        return "success";
    }


    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        // 密码MD5加密
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // 获取Subject对象
        Subject subject = SecurityUtils.getSubject();
            subject.login(token);
            return "success";
    }


    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("/page")
    public String page(@RequestParam("id") String pageName){

        return pageName;}

        @GetMapping("/now.json")
    public @ResponseBody Map datedateTime() throws IOException {
        Map map=new HashMap();
        map.put("time",new Date());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String json ="{\"name\":\"lijz\"}";
            JsonNode node = mapper.readTree(json);
            String name=node.get("name").asText();
            map.put("names",name);
        return map;
    }

    @ResponseBody
    @RequestMapping("/addWorkInfo")
    public String addWorkInfo(@Validated({Bean.Update.class}) Bean bean, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "数据格式错误"+bindingResult.getFieldError().getDefaultMessage();
        }else{
            return JSON.toJSONString(bean);
        }
    }

}
