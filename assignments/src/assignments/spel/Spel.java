package assignments;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Spel {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		//Hello SPEL Example
		Expression exp1 = parser.parseExpression("'Hello SPEL'");
		String message = (String) exp1.getValue();
		System.out.println(message);
		
		//Converting String into byte array
		Expression exp2 = parser.parseExpression("'Hello World'.bytes");  
		byte[] bytes = (byte[]) exp2.getValue();  
		for(int i=0;i<bytes.length;i++){  
		    System.out.print(bytes[i]+" ");  
		}  
		
		//Using concat() method with String
		Expression exp3 = parser.parseExpression("'\nWelcome SPEL'.concat('!')");  
		String message2 = (String) exp3.getValue();  
		System.out.println(message2);
		
		//Getting length after converting string into bytes
		Expression exp4 = parser.parseExpression("'Hello World'.bytes.length");  
		int length = (Integer) exp4.getValue();  
		System.out.println(length);  

		//Converting String contents into uppercase letter
		Expression exp5 = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message3 = exp5.getValue(String.class);  
		System.out.println(message3);
		
		//arithmetic operator  
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());  
		System.out.println(parser.parseExpression("10 * 10/2").getValue());  
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());  
		  
		//logical operator  
		System.out.println(parser.parseExpression("true and true").getValue());  
		  
		//Relational operator  
		System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());  
		
	}
}