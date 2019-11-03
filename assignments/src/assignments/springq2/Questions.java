package assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Question question = (Question) applicationContext.getBean("details");
		Question question1 = (Question) applicationContext.getBean("details1");
		System.out.println(question);
		System.out.println(question1);
	}
	
	
}
