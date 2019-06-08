package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPtest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mybatis/applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("service");
		
		User user = new User();
		user.setId(19);
		user.setName("yyy");
		user.setPassword("123456");
		user.setEmail("test@xxx.com");
		userService.addNewUser(user);
	}
	         
}
