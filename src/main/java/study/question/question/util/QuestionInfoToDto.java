package study.question.question.util;

import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import study.question.question.dto.QuestionInfoDto;
import study.question.question.model.QuestionInfo;

public class QuestionInfoToDto
{
    public QuestionInfoDto getDtoFromQuestionInfo(QuestionInfo questionInfo){
        QuestionInfoDto questionInfoDto = new QuestionInfoDto();
        BeanUtils.copyProperties(questionInfo, questionInfoDto);
        if (!StringUtils.isEmpty(questionInfo.getQuestionPictures())){
            questionInfoDto.setQuestionPictureUrls(questionInfo.getQuestionPictures().split(";"));
        }

        return questionInfoDto;
    }
}
