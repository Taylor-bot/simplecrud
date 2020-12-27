//package cc.ztl.cool.shiro.api;
//
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * @author Taylor
// */
//@Controller
//@RequestMapping("/user")
//public class UserController {
//
//    @GetMapping("/toLogin")
//    public String toLogin() {
//        return "/login.html";
//    }
//
//    @PostMapping("/login")
//    public String login(String name, String password, Model model) {
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken(name, password);
//        System.out.println(token);
//        try {
//            subject.login(token);
//        } catch (UnknownAccountException e) {
//            model.addAttribute("msg", "用户名错误");
//            return "/login.html";
//        } catch (IncorrectCredentialsException e) {
//            model.addAttribute("msg", "密码错误");
//            return "/login.html";
//        }
//        return "/success.html";
//    }
//
//}
