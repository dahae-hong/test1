package dao;

import java.util.List;

import vo.MemberVO;

public interface MemberDAO {

	int insert(String id, String password);

	List<MemberVO> getList();

	MemberVO select(String id);

	int update(String id, String password);

}
