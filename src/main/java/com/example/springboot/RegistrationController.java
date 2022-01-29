package com.example.springboot;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // combination of ResponseBody and Controller
public class RegistrationController {

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody String reqBody) {
        return "You have successfully registered, " + reqBody;
    }

}

