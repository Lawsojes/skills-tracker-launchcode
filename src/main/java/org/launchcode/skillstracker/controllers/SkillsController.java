package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String choices(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<body>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String form(){
        return"<html>"+
                "<body>"+
                "<form action='/form' method='post'>"+
                "<h3>Name:</h3>" +
                "<input type='text' name='name'>" +
                "<h3>My favorite language.</h3>"  +
                "<select name='firstLanguage' id='firstLanguage'>"+
                "<option value='java'>java</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "</select>" +
                "<h3>My second favorite language.</h3>"  +
                "<select name='secondLanguage'>"+
                "<option value='java'>java</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "</select>" +
                "<h3>My third favorite language.</h3>"  +
                "<select name='thirdLanguage'>"+
                "<option value='java'>java</option>"+
                "<option value='Python'>Python</option>"+
                "<option value='C++'>C++</option>"+
                "</select>" +
                "<br>" +
                "<button type='submit'>Submit</button>" +
                "</form>"+
                "</body>"+
                "</html>";
    }

    @PostMapping("/form")
    public String formSubmit(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage){



        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h3>My favorite language is " + firstLanguage + ".</h3>" +
                "<h3>My second favorite language " + secondLanguage + ".</h3>" +
                "<h3>My third favorite language is " + thirdLanguage + ".</h3>"
                ;
    }


}
