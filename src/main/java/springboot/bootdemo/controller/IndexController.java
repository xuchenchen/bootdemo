package springboot.bootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.bootdemo.Bean;
import springboot.bootdemo.generratorpojo.User;
import springboot.bootdemo.service.UserService;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
public class IndexController {
    @Autowired
    ObjectMapper mapper;
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/insertData")
    public String insertData(){
        User user=new User(152,"username","pswd","1565236532");
        userService.insert(user);
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
