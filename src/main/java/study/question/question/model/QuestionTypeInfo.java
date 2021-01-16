package study.question.question.model;

import lombok.Data;

import java.util.Date;

/**
 * 主要包括 并发、大数据、分布式等
 */
@Data
public class QuestionTypeInfo
{
    // 类型id
    String questionTypeId;
    // 类型名称
    String questionTypeName;
    // 类型解释
    String questionTypeDesc;

    Date createTime;
    Date updateTime;
}
