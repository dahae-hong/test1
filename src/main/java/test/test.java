package test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import service.MemberService;
import vo.MemberVO;

public class test {
	@Autowired
	MemberService memberservice;
	
	@Test
	public void test() {
		List<MemberVO> list=memberservice.getList();
		for(MemberVO m:list) {
			System.out.println(m);
		}
	}
}
