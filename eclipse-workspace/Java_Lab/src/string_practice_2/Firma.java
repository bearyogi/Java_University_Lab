package string_practice_2;
import java.util.Scanner;
class Firma {
	static Pracownik listaPracownikow[] = new Pracownik[100]; 
	public static void main(String[] args) {
	
		int ilePracownikow = 0;
	
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("1 - nowy pracownik");
			System.out.println("2 - wypisz liste pracownikow");
			String wybor = scan.nextLine();
			int wyb = Integer.parseInt(wybor);
			switch(wyb)
			{
			case 1:
				ilePracownikow = wpiszPracownika(listaPracownikow,ilePracownikow);
				break;
				
			case 2:
				wypiszPracownikow(listaPracownikow,ilePracownikow);
				break;
				
				default:
					System.out.println("Z³y wybór");
			}
			scan.close();
		}	

	}
	
static public int wpiszPracownika(Pracownik[] listaPracownikow, int ilePracownikow ) {
	String wpis;
	Scanner scan = new Scanner(System.in);
	
	listaPracownikow[ilePracownikow] = new Pracownik();
	System.out.println("Podaj imiê ");
	wpis = scan.nextLine();
	listaPracownikow[ilePracownikow].setImie(wpis);
	System.out.println("Podaj Nazwisko ");
	wpis = scan.nextLine();
	listaPracownikow[ilePracownikow].setNazwisko(wpis);
	System.out.println("Podaj Stanowisko ");
	wpis = scan.nextLine();
	listaPracownikow[ilePracownikow].setStanowisko(wpis);
	ilePracownikow++;
	scan.close();
	return ilePracownikow;

}

static public void wypiszPracownikow(Pracownik[] listaPracownikowint,int  ilePracownikow) {
	for(int i=0;i<ilePracownikow;i++)
	{
		System.out.println("["+i+"]" + "Imiê: " + listaPracownikow[i].getImie() +" Nazwisko: " + listaPracownikow[i].getNazwisko() + " Stanowisko: " + listaPracownikow[i].getStanowisko() );
}
	}


}

class Pracownik{
	private String imie;
	private String nazwisko;
	private String stanowisko;
	
	Pracownik()
	{
		imie = "";
		nazwisko = "";
		stanowisko = "";
	}
	public void setImie(String imie){
		this.imie = imie;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public void setStanowisko(String stanowisko) {
		this.stanowisko = stanowisko;
	}
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public String getStanowisko() {
		return stanowisko;
	}
}
