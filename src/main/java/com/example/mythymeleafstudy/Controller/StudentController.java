package com.example.mythymeleafstudy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

@RequestMapping("/main")
    public static String file(@RequestParam  String make, String color, Model model) {
     System.out.println(make+"  "+color);
    model.addAttribute("make",make);
    model.addAttribute("color",color);

    return ("new2");

    }

    @RequestMapping("/main2")
    public static String file2(@RequestParam(value="make",required = false) String make, String color, Model model) {
        System.out.println(make);
        model.addAttribute("make",make);
        model.addAttribute("color",color);


        return ("new");

    }

    @RequestMapping("/main3/{make2}/{Year}")
    public static String file2(@PathVariable String make2,@PathVariable Integer Year,Model model) {
        System.out.println(make2);
        model.addAttribute("make2",make2);
        model.addAttribute("year2",Year);
        System.out.println(make2);
        System.out.println(Year+"");

        return ("new2");

    }


}
