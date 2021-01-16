package study.question.question.dto;

import lombok.Data;
import study.question.question.model.QuestionClassfyInfo;
import study.question.question.model.QuestionTypeInfo;

import java.util.Date;
import java.util.List;

@Data
public class QuestionInfoDto
{
    long questionId;
    // 问题简述
    String questionDesc;
    // 问题详情s
    String questionDetails;
    // 问题图片s
    String [] questionPictureUrls;
    // 问题类型
    QuestionTypeInfo questionTypeInfo;
    // 问题分类
    QuestionClassfyInfo questionClassfyInfo;
    // 子类问题ids
    List<QuestionInfoDto> questionInfoDtoList;
    // 答案集s
    AnswserInfoDto answserInfoDto;

    Date startTime;
    Date updateTime;
}
