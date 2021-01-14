package study.question.question.mapper;

import study.question.question.model.QuestionInfo;

import java.util.List;

public interface QuestionInfoMapper
{
    void insertQuestionInfo(List<QuestionInfo> questionInfoList);

    void updateQuestionInfo(QuestionInfo questionInfo);
}
