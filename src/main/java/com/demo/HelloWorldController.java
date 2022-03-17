package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    //need a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }



    //need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }




    //new controller method to read form data
    //add data to model
    @RequestMapping("/processForm2")
    public String shoutOut(HttpServletRequest request, Model model){

        //read the request parameter from html form
        String myName=request.getParameter("studentName");

        //convert data to all caps
        myName= myName.toUpperCase();

        //create a message
        String result="HEY!  "+ myName;

        //add message to model
        model.addAttribute("message",result);

        return "helloworld";//the model data is only accessible to helloworld.jsp
    }

}
