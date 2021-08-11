package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class) //Test for Controller 
@WebAppConfiguration 
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/test-context.xml", "file:src/main/webapp/WEB-INF/servlet-context.xml" }) 
public class AdminControllerTest { 
	@Autowired 
	WebApplicationContext context; 
	MockMvc mockMvc; 
	@Test 
	public void setUpMockMvc() 
	{ 
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build(); } }