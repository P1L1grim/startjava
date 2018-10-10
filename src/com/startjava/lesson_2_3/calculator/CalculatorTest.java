package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;
 
public class CalculatorTest {
 
    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);
    	Calculator clc = new Calculator();
    	String prod = "Y";
    	try {	
    		do {		    
		    	System.out.println("Введите первое число!");
		   		clc.setNum1(in.nextDouble());

		    	System.out.println("Введите математический символ + , - , / , * , ^ или % ");
		   		clc.setOper(in.next());

		    	System.out.println("Введите второе число!");
		    	clc.setNum2(in.nextDouble());
		    
		 		clc.calculate();

		 		do {
		 			System.out.println("Хотите продолжить? [Y/N]: ");
		 			prod = in.next();
		 			
		 			if (prod.equalsIgnoreCase("N")){break;}

		 		} while (!prod.equalsIgnoreCase("Y"));  

		    } while (prod.equalsIgnoreCase("Y"));
		} 
		catch (Exception ex) {System.out.println("Некорректный ввод");}
		
    }           
}