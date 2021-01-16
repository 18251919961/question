package study.question.question.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/questionclassfy")
public class QuestionClassfyInfoController
{
    @RequestMapping("/insert")
    public ModelAndView questionClassfy(){
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("11");
        return modelAndView;
    }
}
