package mbm.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.QuestionVO;
import mbm.qna.domain.UserVO;
import mbm.qna.domain.WorkbookVO;
import mbm.qna.mapper.QuestionMapper;
import mbm.qna.mapper.UserMapper;
import mbm.qna.mapper.WorkbookMapper;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	QuestionMapper questionMapper;
	
	@Override
	public List<QuestionVO> all_question(Long booknumber) {
		return questionMapper.all_question(booknumber);
	}
	

	
}
