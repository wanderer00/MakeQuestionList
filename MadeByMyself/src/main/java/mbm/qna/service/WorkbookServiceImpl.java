package mbm.qna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;
import mbm.qna.domain.WorkbookVO;
import mbm.qna.mapper.UserMapper;
import mbm.qna.mapper.WorkbookMapper;

@Service
public class WorkbookServiceImpl implements WorkbookService{
	
	@Autowired
	WorkbookMapper workbookMapper;

	@Override
	public List<WorkbookVO> all_book(String userid) {
		return workbookMapper.all_book(userid);
	}

	@Override
	public void insert_book(WorkbookVO vo) {
		workbookMapper.insert_book(vo);
	}
	
}
