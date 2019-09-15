package com.vino.spring_expression_language;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String message = null;
		Expression exp = null;
		ExpressionParser parser = new SpelExpressionParser();

		exp = parser.parseExpression("'Hello SPEL'");
		message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Welcome SPEL'.concat('!')");
		message = (String) exp.getValue();
		System.out.println(message);

		exp = parser.parseExpression("'Hello World'.bytes");
		byte[] bytes = (byte[]) exp.getValue();
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i] + " ");
		}
		System.out.println();
		exp = parser.parseExpression("'Hello World'.bytes.length");
		int length = (Integer) exp.getValue();
		System.out.println(length);

		//Method 1
		exp = parser.parseExpression("new String('hello world').toUpperCase()");
		message = exp.getValue(String.class);
		System.out.println(message);
		//Method 2
		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());
		
		//arithmetic operator  
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());  
		System.out.println(parser.parseExpression("10 * 10/2").getValue());  
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());  
		  
		//logical operator  
		System.out.println(parser.parseExpression("true and true").getValue());  
		  
		//Relational operator  
		System.out.println(parser.parseExpression("'vino'.length()==5").getValue()); 
		
		//In SpEL, we can store a value in the variable and use the variable in the method and call the method. 
		//To work on variable, we need to use StandardEvaluationContext class.
		Calculation calculation=new Calculation();  
		StandardEvaluationContext context=new StandardEvaluationContext(calculation);  
		parser.parseExpression("number").setValue(context,"5");  
	      
		System.out.println(calculation.cube());  
	}
}
