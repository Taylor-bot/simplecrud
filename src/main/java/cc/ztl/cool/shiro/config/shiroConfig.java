//package cc.ztl.cool.shiro.config;
//
//
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @author Taylor
// */
//@Configuration
//public class shiroConfig {
//
//    /**
//     * ShiroFilterFactoryBean
//     */
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
//        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
//        //1.设置安全管理器
//        bean.setSecurityManager(defaultWebSecurityManager);
//        //2.添加内置过滤器
///**
// *         anon:它对应的过滤器里面是空的,什么都没做,
// *         authc:该过滤器下的页面必须验证后才能访问,它是Shiro内置的一个拦截器
// *         user:记住我使用
// *         perms：拥有对某个资源的权限
// *         roles：拥有某个角色的权限
// */
//
//        Map<String, String> filterMap = new LinkedHashMap<>();
//        /**
//         * 使用通配符来拦截
//         */
//
//        //2.1授权
//        filterMap.put("/user/add", "perms[user:add]");
//
//        filterMap.put("/user/**","authc");
//        bean.setFilterChainDefinitionMap(filterMap);
//
//        bean.setLoginUrl("/user/toLogin");
//        return bean;
//    }
//
//
//    /**
//     * DefaultWebSecurityManager
//     */
//    @Bean
//    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm") UserRealm realm) {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//
//        securityManager.setRealm(realm);
//        return securityManager;
//    }
//
//    /**
//     * 创建realm对象 :第一步
//     *
//     * @return
//     */
//    @Bean("userRealm")
//    public UserRealm userRealm() {
//        return new UserRealm();
//    }
//
//}
