package study.question.question.service;

import org.springframework.stereotype.Service;
import study.question.question.model.QuestionInfo;

import java.util.List;

@Service
public interface QuestionInfoService
{
    void insertQuestionInfo(List<QuestionInfo> questionInfoList);

    void updateQuestionInfo(QuestionInfo questionInfo);
}
