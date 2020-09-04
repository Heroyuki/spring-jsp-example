package jp.co.jsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

@GetMapping(path = "/")
public String home() {
    return "redirect:index";
}

@GetMapping(path = "/index")
public String index(ModelMap model) {
	
	String message = "Hello World";
	model.addAttribute("message", message);

    return "index";
}

}
