package service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDAO;
import vo.MemberVO;

@Service
public class MemberService {
	//@Autowired
	@Inject
	MemberDAO memberdao;
	public int insert(String id, String password) {
		return memberdao.insert(id, password);
	}
	public List<MemberVO> getList() {
		return memberdao.getList();
	}
	public MemberVO select(String id) {
		return memberdao.select(id);
	}
	public int update(String id, String password) {
		return memberdao.update(id,password);
	}

}
