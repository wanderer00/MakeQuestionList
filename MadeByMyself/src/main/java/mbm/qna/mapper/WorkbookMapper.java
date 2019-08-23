package mbm.qna.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;
import mbm.qna.domain.WorkbookVO;

public interface WorkbookMapper {
	@Select("SELECT * FROM WORKBOOK_LIST WHERE USERID = #{userid}")
	public List<WorkbookVO> all_book(String userid);
		
	@Insert("INSERT INTO WORKBOOK_LIST (BOOKNUMBER, WORKBOOK, USERID) VALUES(SEQ_BOOK.nextval,#{workbook},#{userid})")
	public void insert_book(WorkbookVO vo);
	
}
