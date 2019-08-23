package mbm.qna.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mbm.qna.domain.LoginDTO;
import mbm.qna.domain.QuestionVO;
import mbm.qna.domain.WorkbookVO;
import mbm.qna.service.QuestionService;
import mbm.qna.service.UserService;
import mbm.qna.service.WorkbookService;



@Controller
@RequestMapping("/qna/*")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	@GetMapping("/qna/question")
	public String question(@RequestParam("booknumber") Long booknumber, Model model) {
		System.out.println("문제 목록");
		List<QuestionVO> questionlist = questionService.all_question(booknumber);
		for(QuestionVO question : questionlist) {
			System.out.println(question);
		}
		model.addAttribute("questionlist", questionlist);
		return "/qna/Go_question";
	}
		
}
