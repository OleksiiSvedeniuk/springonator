package springboot.springonator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springboot.springonator.entity.User;
import springboot.springonator.service.UserServiceImpl;

@Controller
public class MainController {


    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/save")
    public String save(@RequestParam("username") String username,
    @RequestParam("password") String password    ) {
        userService.save(new User(username,password));
        return "redirect:/";
    }
}
