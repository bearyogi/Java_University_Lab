package string_practice_1;
import java.util.Scanner;
import java.lang.Math;
class Liczba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int wybor=0;
		int liczbaSilnia=0;
		int liczbaMnozenie = 0;
		String liczbaWpis = "";
		String liczbaFin = "";
		int przecinek = 0;
		int tab[] = new int[1];
		while(wybor != 5) {
		System.out.println("1 - wpisz liczbê dziesiêtn¹");
		System.out.println("2 - wypisz liczbê dziesiêtn¹");
		System.out.println("3 - mno¿enie przez int");
		System.out.println("4 - silnia z int");
		System.out.println("5 - wyjœcie");
		
		 wybor = scan.nextInt();
		switch(wybor)
		{
		
		case 1:
			przecinek = 0;
			System.out.println("podaj liczbe: ");
			scan.nextLine();
			liczbaWpis = scan.nextLine();
			przecinek = liczbaWpis.indexOf('.');
			if(przecinek != -1)
			liczbaFin = liczbaWpis.substring(0,przecinek) + liczbaWpis.substring(przecinek+1,liczbaWpis.length());
			else
				liczbaFin = liczbaWpis;
			System.out.println(liczbaFin);
			 tab = new int[liczbaFin.length()];
			 tab = dodawanie(liczbaFin,tab,przecinek);
			break;
			
			
		case 2:
			System.out.print("aktualna liczba to: ");
			int spr = 0;
			for(int i=0;i<liczbaFin.length();)
				
			{
				if(i==przecinek && spr == 0)
				{
					System.out.print(".");
					spr = 1;
				}
				else
				{
					System.out.print(tab[i]);
					i++;
				}
				
			}
			System.out.println();
			break;
			
		case 3:
			String liczbaFinMn;
			System.out.println("podaj przez ile chcesz mno¿yæ");
			liczbaMnozenie = scan.nextInt();
			float wynik = 0F;
			for(int i=0;i<liczbaFin.length();i++)
			{
				wynik += tab[i]*Math.pow(10,liczbaFin.length() - (i+1));
			}
			wynik *= liczbaMnozenie;
			liczbaFin = String.valueOf(wynik);
			przecinek = liczbaFin.indexOf('.');
			
			if(przecinek != -1)
				liczbaFinMn = liczbaFin.substring(0,przecinek) + liczbaFin.substring(przecinek+1,liczbaFin.length());
				else
					liczbaFinMn = liczbaWpis;
				 tab = new int[liczbaFinMn.length()];
				 tab = dodawanie(liczbaFinMn,tab,przecinek);
				 liczbaFin = liczbaFinMn;
			break;
			
		case 4:
			System.out.println("podaj liczbe z której ma byæ silnia");
			liczbaSilnia = scan.nextInt();
			System.out.println("silnia z " + liczbaSilnia + " to " + silnia(liczbaSilnia));
			break;
		case 5:
			scan.close();
			System.out.println("zakoñczono");
			System.exit(0);;
			break;
			default:
				
				System.out.println("z³y wybór!");
		}
		}
		
	}

	public static int[] dodawanie(String liczbaFin,int[] tab,int przecinek)
	{
		for(int i=0;i<liczbaFin.length();i++)
		{
			char c = liczbaFin.charAt(i);
			int cyfra = Character.getNumericValue(c);
			tab[i]=cyfra;
		}
		return tab;
	}
	
	public static int silnia(int liczba) {
		int wynik = 1;
		for(int i=1;i<=liczba;i++)
		{
			wynik = wynik * i;
		}
		return wynik;
	}
}
