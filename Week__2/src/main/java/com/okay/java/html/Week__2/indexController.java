package com.okay.java.html.Week__2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.okay.java.html.Week__2.model.User;
import java.util.HashMap;
import java.util.Map;

@Controller
public class indexController {

    private Map<String, String> registeredUsers = new HashMap<>();

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/register") 
    public String userRegistration(@ModelAttribute User user, Model model){
        System.out.println(user.toString());

        registeredUsers.put(user.getEmail(), user.getPasswd());

        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("phone", user.getPhone());
        model.addAttribute("address", user.getAddress());

        return "welcome";
    }

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        return "login";  
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam("email") String email,
                              @RequestParam("password") String password, Model model) {

        if (registeredUsers.containsKey(email) && registeredUsers.get(email).equals(password)) {
            model.addAttribute("message", "Login successful");
            model.addAttribute("email", email);  // Pass email to the welcome page
            return "welcome";  
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "login";  
        }
    }
}
