package my.com.touchngo.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ExampleController {
    
    @RequestMapping(value = "/index", method = { RequestMethod.POST, RequestMethod.GET })
    public String handlePostRequest(Model model) {
        model.addAttribute("message", "Hello from Thymeleaf!");
        return "index"; // This corresponds to the template name without the .html extension
    }
}
