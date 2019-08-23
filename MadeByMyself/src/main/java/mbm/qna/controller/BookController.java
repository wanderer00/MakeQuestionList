package mbm.qna.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import mbm.qna.domain.WorkbookVO;
import mbm.qna.service.UserService;
import mbm.qna.service.WorkbookService;



@Controller
@RequestMapping("/qna/*")
public class BookController {

	
	@Autowired
	UserService userService;
	
	@Autowired
	WorkbookService workbookservice;
	
	@GetMapping("/index")
	public String main(Model model) {
		System.out.println("홈페이지 소개");
		return "/qna/index";
	}
	
	@GetMapping("/workbooklist")
	public String showlist(Model model) {
		System.out.println("문제집 목록");
		List<WorkbookVO> booklist = workbookservice.all_book("han");
		for(WorkbookVO workbook : booklist) {
			System.out.println(workbook);
		}
		model.addAttribute("booklist", booklist);
		return "/qna/Go_workbooklist";
	}
	
	@PostMapping("/insert_workbook")
	public String workbook(WorkbookVO vo) {
		System.out.println("insert workbook...");
		workbookservice.insert_book(vo);
		return "/qna/Go_workbooklist";
	}
	
		
}
