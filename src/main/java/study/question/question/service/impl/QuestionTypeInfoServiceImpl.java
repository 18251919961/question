package study.question.question.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.question.question.mapper.QuestionTypeInfoMapper;
import study.question.question.model.QuestionTypeInfo;
import study.question.question.service.QuestionTypeInfoService;

@Service
public class QuestionTypeInfoServiceImpl implements QuestionTypeInfoService
{
    @Autowired
    QuestionTypeInfoMapper questionTypeInfoMapper;

    public QuestionTypeInfo query(){
        return questionTypeInfoMapper.query();
    }

    public Long insert(QuestionTypeInfo questionTypeInfo){
        return questionTypeInfoMapper.insert(questionTypeInfo);
    }
}
