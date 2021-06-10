package me.pablo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello(@RequestParam(value = "f_name", required = false) String f_name,
                           @RequestParam(value = "l_name", required = false) String l_name) {
        if(f_name != null) {
            if(l_name != null) {
                return "Hello " + f_name + " " + l_name + "!";
            }
            return "Hello " + f_name + "!";
        } else {
            return "Hello Human!";
        }
    }

}
