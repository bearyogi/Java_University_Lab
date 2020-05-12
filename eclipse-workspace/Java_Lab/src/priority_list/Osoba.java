package priority_list;

public class Osoba implements Comparable<Osoba> {

	private String dane;
	private int wiek;
	public Osoba(String dane, int wiek){
		this.dane = dane;
		this.wiek = wiek;
	}
	
	public String getDane() {
		return dane;
	}
	public void setDane(String dane) {
		this.dane = dane;
	}
	
	public int getWiek() {
		return wiek;
	}
	
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	
	public int compareTo(Osoba o) {
		int poDanych = dane.compareTo(o.getDane());
		if(poDanych !=0) {
			return poDanych;
		}
		Integer w = wiek;
		return w.compareTo(o.getWiek());
		
	}
}
