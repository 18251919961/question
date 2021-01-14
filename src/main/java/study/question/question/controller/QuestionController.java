package study.question.question.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class QuestionController
{
    @RequestMapping("/index")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
