package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//tells spring that this is mvc controller
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        return "main-menu";
    }
}
//steps
//create controller class
//define controller method
//Add request mapping to controller method
//return view name
//develop view page
