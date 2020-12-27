//package cc.ztl.cool.shiro.config;
//
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//
///**
// * @author Taylor
// */
//public class UserRealm extends AuthorizingRealm {
//
//    /**
//     * 为当前登录的Subject授予角色和权限
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        System.out.println("执行了授权功能");
//
//        //授权
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermission("user:add");
//        return info;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println("执行了认证功能");
//
//        /**
//         * 取出正确的用户名和密码，进行验证
//         */
//        String username = "123";
//        String password = "123";
//        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
//
//        if (!token.getUsername().equals(username)) {
//            //这里的return会直接抛出异常
//            return null;
//        }
//        /**
//         * 这里的password直接类的实现类帮我们实现了
//         */
//        return new SimpleAuthenticationInfo("",password,"");
//    }
//}
