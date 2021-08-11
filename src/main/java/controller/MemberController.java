package controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MemberService;
import vo.MemberVO;
@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberservice;
	
	@RequestMapping("input")
	public String input() {
		return "/WEB-INF/views/input.jsp";
	}
	
	@RequestMapping("inputProc")
	public ModelAndView inputProc(String id, String password) {
		System.out.println(id+":"+password);
		int result=memberservice.insert(id,password);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",result==1 ? "성공":"실패");
		mv.setViewName("/WEB-INF/views/result.jsp");
		return mv;
	}
	
	@RequestMapping("list")
	public ModelAndView list() {
		List<MemberVO> list=memberservice.getList();
		for(MemberVO m:list) {
			System.out.println(m);
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",list);
		mv.setViewName("/WEB-INF/views/list.jsp");
		return mv;
	}
	// localhost:8080/member/read?id=user
	@RequestMapping("read")
	public ModelAndView read(String id) {
		MemberVO member=memberservice.select(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("member",member);
		mv.setViewName("/WEB-INF/views/read.jsp");
		return mv;
	}
	
	@RequestMapping("update")
	public ModelAndView update(String id, String password) {
		//MemberVO member=memberservice.select(id);
		System.out.println(id+":"+password);
		MemberVO member=new MemberVO(id, password);
		ModelAndView mv =new ModelAndView();
		mv.addObject("member",member);
		mv.setViewName("/WEB-INF/views/update.jsp");
		return mv;
	}
	@RequestMapping("updateProc")
	public ModelAndView updateProc(String id, String password) {
		int result=memberservice.update(id,password);
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",result==1 ? "업데이트성공":"업데이트실패");
		mv.setViewName("/WEB-INF/views/result.jsp");
		return mv;
	}
}
