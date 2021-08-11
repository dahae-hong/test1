package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import vo.MemberVO;

@Repository
public class OracleMemberDAO implements MemberDAO{
	@Autowired
	DriverManagerDataSource ds; //Connection
	@Override
	public int insert(String id, String password) {
		String sql="insert into member values(?,?)";
		try {
			PreparedStatement pstmt=
					ds.getConnection().prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			int result=pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<MemberVO> getList() {
		String sql="select * from member";
		try {
			PreparedStatement pstmt=ds.getConnection().prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			List list=new ArrayList<MemberVO>();
			while(rs.next()) {
				MemberVO member=new MemberVO();
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
				list.add(member);
			}
			rs.close();
			pstmt.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public MemberVO select(String id) {
		String sql="select * from member where id=?";
		try {
			PreparedStatement pstmt=ds.getConnection().prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs=pstmt.executeQuery();
			MemberVO member=new MemberVO();
			if(rs.next()) {
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
			}
			rs.close();
			pstmt.close();
			return member;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int update(String id, String password) {
		String sql="update member set password=? where id=?";
		try {
			PreparedStatement pstmt=
					ds.getConnection().prepareStatement(sql);
			pstmt.setString(2, id);
			pstmt.setString(1, password);
			int result=pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
