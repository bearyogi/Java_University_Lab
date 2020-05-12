package priority_list;

public class Przedmiot implements Comparable<Przedmiot> {

	private String nazwa;
	private int cena;
	public Przedmiot(String nazwa, int cena){
		this.nazwa = nazwa;
		this.cena = cena;
	}
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public int getCena() {
		return cena;
	}
	
	public void setWiek(int cena) {
		this.cena = cena;
	}
	
	public int compareTo(Przedmiot o) {
		int poNazwie = nazwa.compareTo(o.getNazwa());
		if(poNazwie !=0) {
			return poNazwie;
		}
		Integer c = cena;
		return c.compareTo(o.getCena());
		
	}
}
