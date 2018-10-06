import java.util.Scanner;
 
public class CalculatorTest {
 
    public static void main(String[] args) {
       
    	Scanner in = new Scanner(System.in);
    	Calculator clc = new Calculator();
	    try{
	    System.out.println("Введите первое число!");
	   	clc.setNum1(in.nextDouble());

	    System.out.println("Введите математический символ + , - , / , * , ^ или % ");
	   	clc.setOper(in.next());

	    System.out.println("Введите второе число!");
	    clc.setNum2(in.nextDouble());
	    
	 	clc.calculate();   
	    }
	    catch(Exception ex) {System.out.println("Некорректный ввод");}
    }           
}