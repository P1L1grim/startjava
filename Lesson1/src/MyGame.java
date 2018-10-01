import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {

		int rand_num = (int) (1 + Math.random()*100);
		Scanner in = new Scanner(System.in);
		System.out.println("Компьютер загадал чисто в диапазоне 1 - 100, попробуй его угадать!");

		try {
			int try_num = in.nextInt();
			while(try_num != rand_num) {

				if(try_num < rand_num) {System.out.println("Введённое число меньше загаданного, попробуйте ещё");
				 	try_num = in.nextInt();}

				else {System.out.println("Введённое число больше загаданного, попробуйте ещё");
				 	try_num = in.nextInt();}
			}
				System.out.println("Вы угадали!");
		}
		catch(Exception ex) {System.out.println("Некорректный ввод!");}
		


	}
}