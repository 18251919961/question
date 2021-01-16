package study.question.question.service;

import study.question.question.model.QuestionTypeInfo;

public interface QuestionTypeInfoService
{
    QuestionTypeInfo query();

    Long insert(QuestionTypeInfo questionTypeInfo);
}
