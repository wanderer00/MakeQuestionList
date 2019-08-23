package mbm.qna.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.UserVO;
import mbm.qna.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user/login")
	public void login(LoginDTO dto) {
			
	}
	
	@PostMapping("/user/loginPost")
	public void loginPost(LoginDTO dto, HttpSession session, Model model) {
		System.out.println("loginpost..."+dto);
		userService.login(dto);
		UserVO vo = userService.login(dto);
		if(vo == null) {
			return ;
		}
			model.addAttribute("userVO",vo);
		
	}
	
	@GetMapping("/user/sign")
	public String user() {
		System.out.println("sign get...");
		return "/user/sign";
	}
	
	@PostMapping("/user/sign")
	public String user(UserVO vo) {
		System.out.println("reg post...");
		userService.sign(vo);
		return "redirect:/user/login";
	}
	

	
}
