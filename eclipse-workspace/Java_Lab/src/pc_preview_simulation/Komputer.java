package pc_preview_simulation;
import java.util.Scanner;

import pc_preview_simulation_res.*;

public class Komputer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Procesor procesor = new Procesor("Intel i5-4690", 4, 3500);
		KartaGraficzna karta = new KartaGraficzna("GTX970", 6, 1140);
		Zasilacz zasilacz = new Zasilacz("SilentiumPC", 630);
		Ram ram = new Ram("HyperX", 16);
		Dysk dysk = new Dysk("Adata", 500);
		PC magnum = new PC("SilntiumPC", 4000, procesor, karta, zasilacz, ram, dysk);
		System.out.println("Chcesz przejrzec w³aœciwoœci sprzêtu?");
		System.out.println("1 - obudowa");
		System.out.println("2 - cena");
		System.out.println("3 - procesor");
		System.out.println("4 - karta graficzna");
		System.out.println("5 - zasilacz");
		System.out.println("6 - ram");
		System.out.println("7 - dysk");
		System.out.println("0 - wyjscie");
		int wybor = 10;
		while(wybor != 0)
		{
			wybor = Integer.parseInt(scan.nextLine());
			if(wybor!=0)
				magnum.komponenty(wybor);
		}
		System.out.println();
		System.out.println();
		System.out.println("Ca³y sprzêt: ");
		Zestaw desktop = new Zestaw("Genesis","A4tech","HyperX",magnum.obudowa,magnum.cena,magnum.procesor,magnum.kartaGraficzna,magnum.zasilacz,magnum.ram,magnum.dysk);
		desktop.calyZestaw();
		scan.close();
	}

}


	 class Zestaw extends PC {
		  String klawiatura;
		  String mysz;
		  String sluchawki;
		  public Zestaw(String klawiatura, String mysz, String sluchawki, String obudowa, int cena, Procesor procesor,  KartaGraficzna kartaGraficzna, Zasilacz zasilacz, Ram ram,Dysk dysk) {
		    super(obudowa,cena, procesor, kartaGraficzna,zasilacz,ram,dysk);
		    this.klawiatura = klawiatura;
		    this.mysz = mysz;
		    this.sluchawki = sluchawki;
		   }

		   public void calyZestaw() {
		     System.out.println("Peryferia: klawiatura: " + klawiatura + " , mysz: " + mysz + " , sluchawki : " + sluchawki);
		     System.out.println("Obudowa : " + obudowa);
		     System.out.println("Cena : " + cena);
		     System.out.print("Procesor: ");
		    procesor.get();
		    System.out.print("Karta graficzna: ");
		    kartaGraficzna.get();
		    System.out.print("Zasilacz: ");
		    zasilacz.get();
		    System.out.print("Ram: ");
		    ram.get();
		    System.out.print("Dysk: ");
		    dysk.get();
		     
		     }
		}
