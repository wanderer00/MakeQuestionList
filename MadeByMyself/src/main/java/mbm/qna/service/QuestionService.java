package mbm.qna.service;

import java.util.List;

import mbm.qna.domain.QuestionVO;

public interface QuestionService {
	public List<QuestionVO> all_question(Long booknumber);
		
}
