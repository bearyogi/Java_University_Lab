package bankSimulation_unfinished;
import java.util.ArrayList;
import java.time.LocalDate;
public class Bankomat {
String lokalizacja = "";
String bank = "";
Konto aktualneKonto;
LocalDate date;
ArrayList<LocalDate> data = new ArrayList<LocalDate>();
ArrayList<Double> lista = new ArrayList<Double>();
int[] banknotyIlosc = new int[] {10,10,10,10,10};
Bankomat(String lokalizacja, String bank){
	this.lokalizacja = lokalizacja;
	this.bank = bank;
}

void jakieKonto(Konto aktualneKonto){
	this.aktualneKonto = aktualneKonto;
}
void wplacNaKonto(double kwota, Konto konto){
	if(aktualneKonto.getSrodki()>=kwota) {
		if(konto.rodzajKonta.contentEquals(aktualneKonto.rodzajKonta)==false ) {
			aktualneKonto.przelej(kwota, konto);
			double prowizja = (kwota*5/100);
			if(prowizja > 10.0) {
				prowizja = 10.0;
			}
			
			aktualneKonto.zabierz(prowizja);
			lista.add(kwota);
		}
		else if(konto.rodzajKonta.contentEquals(aktualneKonto.rodzajKonta)==true ) {
			aktualneKonto.przelej(kwota, konto);
			lista.add(kwota);
		}
		
	}
	else if(aktualneKonto.getSrodki()<kwota) {
		System.out.println("nie posiadasz takich srodkow");
	}
}

String wyplacZKonta(double kwota){
	if(aktualneKonto.getSrodki()>=kwota) {
		while(kwota > 0) {
			if(kwota>=200 && banknotyIlosc[4]>0)
			{
				kwota-=200;
				banknotyIlosc[4]--;
			}
				
			else if(kwota>=100 && banknotyIlosc[3]>0)
			{
				kwota-=100;
				banknotyIlosc[3]--;
			}
				
			else if(kwota>=50 && banknotyIlosc[2]>0)
			{
				kwota-=50;
				banknotyIlosc[2]--;
			}
				
			else if(kwota>=20 && banknotyIlosc[1]>0)
			{
				kwota-=20;
				banknotyIlosc[1]--;
			}
			
			else if(kwota>=10 && banknotyIlosc[0]>0) {
				kwota-=10;
				banknotyIlosc[0]--;
			}
				
			else if(kwota <10)
				return "nie mozna wyplacic";
				
		}
		
		lista.add(kwota);
		return "wyplacono + " + aktualneKonto.wyplac(kwota) + " z³" ;
	}


		return "nie mozna wyplacic";
			

	}

public String toString() {
	String wynik = "";
	for(int i=0;i<lista.size();i++) {
		wynik += lista.get(i);
	}
	return wynik;
}
}
