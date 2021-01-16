package study.question.question.model;

import lombok.Data;

import java.util.Date;

/**
 * 主要分类java、数据库等
 */
@Data
public class QuestionClassfyInfo
{
    // 类型id
    String questionClassfyId;
    // 类型名称
    String questionClassfyName;
    // 类型解释
    String questionClassfyDesc;

    Date createTime;
    Date updateTime;
}
