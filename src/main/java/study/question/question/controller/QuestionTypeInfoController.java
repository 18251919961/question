package study.question.question.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import study.question.question.conf.RedisService;
import study.question.question.constant.QuestionConstants;
import study.question.question.model.QuestionTypeInfo;
import study.question.question.service.QuestionTypeInfoService;

@RestController
@RequestMapping("/questiontypeinfo")
public class QuestionTypeInfoController
{
    @Autowired
    QuestionTypeInfoService questionTypeInfoService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/init")
    public ModelAndView init()
    {
        ModelAndView modelAndView = new ModelAndView("questiontype/insert");
        return modelAndView;
    }

    @RequestMapping("/insertQuestionType")
    public void insertQuestionType(
        @RequestBody QuestionTypeInfo questionTypeInfo)
    {
        questionTypeInfoService.insert(questionTypeInfo);
        String key = QuestionConstants.QUESTIONTYPEINFO_SUX + questionTypeInfo.getQuestionTypeId();
        redisService.set(key, JSONObject.toJSON(questionTypeInfo));
    }

    @RequestMapping("/query")
    public ModelAndView query()
    {
        ModelAndView modelAndView = new ModelAndView("questiontype/list");
        return modelAndView;
    }
}
