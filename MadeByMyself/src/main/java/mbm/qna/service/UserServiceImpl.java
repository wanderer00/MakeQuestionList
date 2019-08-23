package mbm.qna.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;
import mbm.qna.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	

	@Override
	public UserVO login(LoginDTO dto) {
		return userMapper.login(dto);
	}


	@Override
	public void sign(UserVO vo) {
		userMapper.sign(vo);
	}
	
	

}
