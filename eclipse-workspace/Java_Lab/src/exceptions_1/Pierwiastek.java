package exceptions_1;
import java.lang.Math;
import java.util.Scanner;


public class Pierwiastek {
	public static void main(String[] args) {
		System.out.print("Podaj liczbê z której chcesz otrzymaæ pierwiastek : ");
		Scanner scanner = new Scanner(System.in);
		double liczba;
		try {
			 liczba = scanner.nextDouble();
			if (liczba < 0)
			{
				scanner.close();
				throw new IllegalArgumentException();
				
			}
			else if(liczba >=0){
			liczba = Math.sqrt(liczba);
			System.out.println("Pierwiastek to: " + liczba);
			scanner.close();
			}
		}
		
		
		catch (IllegalArgumentException e) {
			System.out.println("Nie ma pierwiastka z liczby ujemnej!");
		}
		
		
	}
} 