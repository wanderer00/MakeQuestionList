package mbm.qna.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;

public interface UserMapper {
	@Select("select userid, userpw, username from user_table where userid = #{loginId} and userpw = #{loginPw}")
	public UserVO login(LoginDTO dto);
	
	@Insert("insert into user_table (userid, userpw, username) values (#{userId},#{userPw},#{userName})")
	public void sign(UserVO vo);
	
	
}
