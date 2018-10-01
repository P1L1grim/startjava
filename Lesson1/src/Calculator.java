import java.util.Scanner;
 
public class Calculator {
 
    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);
	    try{
	    System.out.println("Введите первое число!");
	    Double num1 = in.nextDouble();
	    System.out.println("Вы ввели: " + num1);
	    System.out.println("Введите второе число!");
	    Double num2 = in.nextDouble();
	    System.out.println("Вы ввели: " + num2);
	    System.out.println("Введите математический символ + , - , / , * или % ");
	    String oper = in.next();
	    System.out.println("Вы ввели: " + oper);
	        switch (oper) {
	            case "-": System.out.println("Выбранная операция - вычитание, " + num1 + " - " + num2 + " = " + (num1 - num2)); break;
	            case "+": System.out.println("Выбранная операция - сложение, " + num1 + " + " + num2 + " = " + (num1 + num2)); break;
	            case "/": System.out.println("Выбранная операция - деление, " + num1 + " / " + num2 + " = " + (num1 / num2)); break;
	            case "*": System.out.println("Выбранная операция - умножение, " + num1 + " * " + num2 + " = " + (num1 * num2)); break;
	            case "%": System.out.println("Выбранная операция - деление по модулю, " + num1 + " % " + num2 + " = " + (num1 % num2)); break;
	            default: System.out.println("Данный символ не включен в функционал нашего калькулятора");
	            }
	        }
	    catch(Exception ex) {System.out.println("Некорректный ввод");}
    }           
}