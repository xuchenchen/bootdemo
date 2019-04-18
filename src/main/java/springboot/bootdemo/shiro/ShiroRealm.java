package springboot.bootdemo.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.bootdemo.generratorpojo.User;
import springboot.bootdemo.generratorpojo.UserMapper;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // 获取用户输入的用户名和密码
        try {
            String userName = (String) token.getPrincipal();
            String password = new String((char[]) token.getCredentials());
            User user=new User(userName,password);
            System.out.println("用户" + userName + "认证-----ShiroRealm.doGetAuthenticationInfo");
            SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
            return info;
        }catch (Exception e){
            return null;
        }

    }
}
