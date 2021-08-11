package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@Autowired
	//@Qualifier(value = "ds") // name사용
	@Qualifier(value = "datasource") // id사용
	DriverManagerDataSource ds;//Connection 얻기 위함
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("index.jsp");
		return "index.jsp"; //기본경로 webapp
	}
	
	//localhost:8080/ds?user=user
	@RequestMapping("/ds")
	public ModelAndView ds(@RequestParam(required = false) String user) {
		ModelAndView mv=new ModelAndView();
		//String sql="select password from member where id='user'";
		String sql="select password from member where id=?";
		try {
			PreparedStatement pstmt
			=ds.getConnection().prepareStatement(sql);
			pstmt.setString(1, user);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("password"));
				mv.addObject("password",rs.getString("password"));
				mv.setViewName("ds.jsp");
				rs.close();
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mv; //기본경로 webapp
	}
}




