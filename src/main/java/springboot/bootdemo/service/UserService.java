package springboot.bootdemo.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.scheduling.annotation.Async;
import springboot.bootdemo.generratorpojo.User;
import springboot.bootdemo.generratorpojo.UserExample;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public interface UserService {
    @Async
    public Future<String> asyncMethod();



    public void syncMethod();
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectUsers(Map map);
}
