package study.question.question.mapper;

import study.question.question.model.QuestionTypeInfo;

public interface QuestionTypeInfoMapper
{
    QuestionTypeInfo query();

    Long insert(QuestionTypeInfo questionTypeInfo);
}
