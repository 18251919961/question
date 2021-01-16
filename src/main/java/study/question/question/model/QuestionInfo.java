package study.question.question.model;

import lombok.Data;

import java.util.Date;

@Data
public class QuestionInfo
{
    long questionId;
    // 问题简述
    String questionDesc;
    // 问题详情s
    String questionDetails;
    // 问题图片s
    String questionPictures;
    // 问题类型
    Integer questionTypeId;
    // 问题分类
    Integer questionClassfy;
    // 子类问题ids
    String questionChildIds;
    // 父问题id
    long parentId;
    // 答案集s
    String answserId;

    Date createTime;
    Date updateTime;
}
