package priority_list;

public class Main {

	public static void main(String[] args) {
		Osoba Dominik = new Osoba("Dominik", 20);
		Osoba Michal = new Osoba("Micha³", 10);
		PriorityList<Osoba> lista = new PriorityList<Osoba>(10);
		lista.dodajElement(Dominik);
		lista.dodajElement(Michal);
		lista.pobierzElement();
		lista.getRozmiar();
		System.out.println(lista);
		
		
		Przedmiot Stol = new Przedmiot("Stó³", 500);
		Przedmiot Szafa = new Przedmiot("Szafa", 1500);
		Przedmiot Lampa = new Przedmiot("Lampa", 200);
		PriorityList<Przedmiot> lista2 = new PriorityList<Przedmiot>(10);
		lista2.dodajElement(Stol);
		lista2.dodajElement(Szafa);
		lista2.dodajElement(Lampa);
		lista2.pobierzElement();
		lista2.getRozmiar();
		System.out.println(lista2);
	}

}
