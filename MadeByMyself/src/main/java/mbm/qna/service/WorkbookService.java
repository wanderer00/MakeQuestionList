package mbm.qna.service;

import java.util.List;

import mbm.qna.domain.WorkbookVO;

public interface WorkbookService {
	public List<WorkbookVO> all_book(String userid);
	public void insert_book(WorkbookVO vo);
		
}
