package mbm.qna.service;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;

public interface UserService {
		public UserVO login(LoginDTO dto);
		public void sign(UserVO vo);
		
}
