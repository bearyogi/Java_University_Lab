package exceptions_3;
import java.lang.Math;
import java.util.Scanner;


public class Pierwiastek {
	public static void main(String[] args) {
System.out.println("Halo");
		Scanner scanner = new Scanner(System.in);
		double liczba1;
		double liczba2;
		double wynik;
		try {
			System.out.print("podaj podstawe:");
			 liczba1 = scanner.nextDouble();
			 System.out.println();
				System.out.print("podaj stopien:");
			 liczba2 = scanner.nextDouble();
			 System.out.println();
			if (liczba1 < 0)
			{
				scanner.close();
				throw new IllegalArgumentException();
			}
			if(liczba1>=0)
			{
				try {
					if(liczba2==0)
					{
						scanner.close();
						throw new IllegalArgumentException();
					}
					else if(liczba2!=0) {
						wynik = Math.pow(liczba1,1/liczba2);
						System.out.println("Wynik: " + wynik);
					}
				}
				catch (IllegalArgumentException e) {
					System.out.println("podano nieprawidlowa liczbe do stopnia pierwiastka!");
				}
			}
		}
		
		catch (IllegalArgumentException e) {
			System.out.println("Podano nieprawidlowa liczbe do podstawy pierwiastka!");
		}
		
		
	}
} 