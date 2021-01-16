package study.question.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import study.question.question.conf.RedisService;

@Controller
@RequestMapping("questioninfo")
public class QuestionInfoController
{
    @Autowired
    RedisService redisService;

    @RequestMapping("/index")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView("index");
        System.out.println("11");
        return modelAndView;
    }

}
