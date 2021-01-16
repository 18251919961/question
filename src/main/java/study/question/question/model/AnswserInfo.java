package study.question.question.model;

import lombok.Data;

import java.util.Date;

@Data
public class AnswserInfo
{
    long answerId;
    // 答案详情s
    String answerDetail;
    // 答案图片s
    String answserPictures;

    Date createTime;
    Date updateTime;
}
