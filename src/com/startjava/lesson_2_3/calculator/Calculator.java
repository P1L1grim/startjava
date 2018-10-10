package com.startjava.lesson_2_3.calculator;

public class Calculator {
 
    	
	    
	    private double num1;
	    private String oper;
	    private double num2;

	    public void setNum1(double num1) {
	    	this.num1 = num1;
	    	System.out.println("Вы ввели: " + num1);}
	    
	    public void setOper(String oper) {
	    	this.oper = oper;
	    	System.out.println("Вы ввели: " + oper);}
	    
	    public void  setNum2(double num2) {
	    	this.num2 = num2;
	    	System.out.println("Вы ввели: " + num2);}
	    
	    
	    public void calculate() {
	        switch (oper) {
	            case "-": System.out.println("Выбранная операция - вычитание, " + num1 + " - " + num2 + " = " + (num1 - num2)); break;
	            case "+": System.out.println("Выбранная операция - сложение, " + num1 + " + " + num2 + " = " + (num1 + num2)); break;
	            case "/": System.out.println("Выбранная операция - деление, " + num1 + " / " + num2 + " = " + (num1 / num2)); break;
	            case "*": System.out.println("Выбранная операция - умножение, " + num1 + " * " + num2 + " = " + (num1 * num2)); break;
	            case "^": System.out.println("Выбранная операция - возведение в степень, " + num1 + " ^ " + num2 + " = " + Math.pow(num1,num2)); break;
	            case "%": System.out.println("Выбранная операция - деление по модулю, " + num1 + " % " + num2 + " = " + (num1 % num2)); break;
	            default: System.out.println("Данный знак математической операции не включен в функционал нашего калькулятора");
	        }
	    }
}
          