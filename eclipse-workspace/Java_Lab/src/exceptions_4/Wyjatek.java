package exceptions_4;
import java.util.Scanner;

public class Wyjatek {
	public static void main(String[] args)
	{
		int liczba = 0;
		try
		{
			
			liczba=insertNumber();
			System.out.println("Liczba : " + liczba);
		}
		catch (Exc exception) {
			System.out.println(exception.getMessage());
		}
	}
	
	static int insertNumber() throws Exc
	{
		int liczba = 0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Podaj liczbê ujemn¹");
		
		liczba = scanner.nextInt();
	scanner.close();
		if(liczba<=0)
			return liczba;
		else 
			throw new Exc("Liczba nie jest ujemna!");
	}
}