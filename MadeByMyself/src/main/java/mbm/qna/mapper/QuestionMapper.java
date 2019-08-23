package mbm.qna.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Select;

import mbm.qna.domain.QuestionVO;



public interface QuestionMapper {
	@Select("SELECT * FROM QUESTION_LIST WHERE BOOKNUMBER=#{booknumber}")
	public List<QuestionVO> all_question(Long booknumber);

	
}
