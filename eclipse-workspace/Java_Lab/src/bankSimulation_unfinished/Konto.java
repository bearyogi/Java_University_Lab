package bankSimulation_unfinished;
import java.util.ArrayList;
public class Konto {
	String rodzajKonta = "";
	int numerKonta = 0;
	String imie = "";
	String nazwisko = "";
	double srodki = 0.0;
	ArrayList<Double> lista = new ArrayList<Double>();
	Konto(String rodzajKonta,int numerKonta, String imie, String nazwisko, double srodki){
		this.rodzajKonta = rodzajKonta;
		this.numerKonta = numerKonta;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.srodki = srodki;
	}
	
	double wyplac(double kwota) {
		if(kwota<=srodki)
		{
			srodki-=kwota;
			lista.add(-1*kwota);
			return kwota;
		}
		else
			return 0;
	}
	void zabierz(double kwota) {
		srodki-=kwota;
	}
	void wplac(double kwota) {
		srodki+=kwota;
		lista.add(kwota);
	}
	double getSrodki() {
		return srodki;
	}
	void przelej(double kwota, Konto konto) {
		if(kwota<=srodki)
		{
			srodki-=kwota;
			lista.add(-1*kwota);
			konto.wplac(kwota);
		}
	}
	void archiwum() {
		for(int i=0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}
	}
	public String toString() {
		String wynik = "";
		wynik += rodzajKonta;
		wynik+= " ";
		wynik+= imie;
		wynik+= " ";
		wynik+= nazwisko;
		wynik+= " ";
		wynik+= srodki;
		return wynik;
	}
}
