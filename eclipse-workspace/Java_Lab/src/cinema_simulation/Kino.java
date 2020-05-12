package cinema_simulation;
import java.util.Scanner;
import cinema_simulation_res.*;
class Kino {
	public static void main(String[] args) {
		/////////////////////////////////
		int ileWolnych[] = new int[] {0,1,2,1,5};
		int ktoreWolne[][] = new int[][] 
			{{1,1,1,1,1,1,1,1},
			{1,1,1,1,0,1,1,1},
			{1,0,1,1,0,1,1,1},
			{1,1,1,1,0,1,1,1},
			{0,0,0,1,0,1,1,0}};
		
		String jakieKino = "";
		String jakiFilm = "";
		int jakaSala = 0;
		int wybor = 99999;
		Film film = new Film();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Witaj na stronie kina Delfin");
		System.out.println("Podaj swoje imiê i nazwisko ( oddzielone enterem)");
		Dane dane = new Dane(scan.nextLine(),scan.nextLine());
		
		System.out.print("Hej " + dane.getImie() + "! podaj miasto w jakim znajduje sie Twoje kino : ");
		jakieKino = lokalizacja(jakieKino);
		
		System.out.println(film);
		for(int i=0;i<Film.tabTytul.length;i++)
			System.out.println(Film.tabTytul[i]);
		System.out.print("Wybierz film: ");
		jakiFilm = film(jakiFilm);
		jakaSala = sala(jakaSala, jakiFilm);
		System.out.println("Na wybrany seans jest " + ileWolnych[jakaSala] + " miejsc");
		while(wybor > ileWolnych[jakaSala])
		{
		System.out.print("Ile miejsc chcesz zaj¹æ? "); wybor = Integer.parseInt(scan.nextLine());
		if(wybor > ileWolnych[jakaSala])
			System.out.println("Nie ma tylu wolnych miejsc!");
		}
		System.out.println("Wolne miejsca:");
		for(int i=0;i<ktoreWolne[jakaSala].length;i++)
			if(ktoreWolne[jakaSala][i] == 0)
				System.out.println("Miejsce : " +(i+1) );
		int wybrane[] = new int[wybor];
		System.out.print("Wybierz miejsca: ");
		
		for(int i=0;i<wybrane.length;)
		{
			wybor = Integer.parseInt(scan.nextLine());
			wybor = wybor - 1;
			if(wybor>=0 && wybor <ktoreWolne[0].length) {
				if(ktoreWolne[jakaSala][wybor] == 1)
					System.out.println("To miejsce jest zajête!");
					else
					{
						System.out.println("Zarezerwowano!");
						wybrane[i] = wybor + 1;
						i++;
					}
			}
			else
			{
				System.out.println("Wybierz poprawny numer miejsca!");
			}
			
		}
		
		System.out.println("Podaj swoje dane osobowe by dokonaæ rezerwacji");
		System.out.print("Imiê i Nazwisko (oddzielone enterem) : "); DaneRezerwacji daneRezerwacji = new DaneRezerwacji(scan.nextLine(), scan.nextLine());
		System.out.print("Nr telefonu : "); daneRezerwacji.setNrTel(scan.nextLine());
		System.out.print("e-mail : "); daneRezerwacji.setEmail(scan.nextLine());
		System.out.println("Rezerwacja udana! Dane osoby rezerwuj¹cej:");
		System.out.println("Imie: " + daneRezerwacji.getImie());
		System.out.println("Nazwisko: " + daneRezerwacji.getNazwisko());
		System.out.println("Numer telefonu: " + daneRezerwacji.getNrTel());
		System.out.println("Adres e-mail: " + daneRezerwacji.getEmail());
		System.out.println("Kino Delfin " + jakieKino + ", tytu³ filmu: " + jakiFilm);
		System.out.print("Sala " + jakaSala + ", zarezerwowane miejsca: ");
		for(int i=0;i<wybrane.length;i++)
		{
			System.out.print(wybrane[i] + " ");
		}
		scan.close();
	}
	
	
	
	
static String lokalizacja(String jakieKino) {
	Scanner scan = new Scanner(System.in);
	boolean takieSame = false;
	while(takieSame != true)
	{
		jakieKino = scan.nextLine();
		takieSame = Lokalizacja.isSame(jakieKino);
		if(takieSame == false)
			System.out.println("W podanym miescie nie znajduje siê kino!");
	}
	scan.close();
	return jakieKino;
}
static String film(String jakiFilm) {
	Scanner scan = new Scanner(System.in);
	int takieSame = 0;
	while(takieSame <1)
	{
		jakiFilm = scan.nextLine();
		takieSame = Film.isSame(jakiFilm);
		if(takieSame == 0)
			System.out.println("Dziœ nie jest grany podany tytu³!");
	}
	scan.close();
	return jakiFilm;
}
static int sala(int sala,String film) {
	int takieSame = 0;
		takieSame = Film.isSame(film);
	return takieSame;
}

}





