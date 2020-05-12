package priority_list;

import java.util.Arrays;

public class PriorityList<T> {

	private T top;
	T[] lista;
	int pojemnosc;
	int rozmiar;
	
	
	PriorityList(int pojemnosc){
		this.pojemnosc = pojemnosc;
		T[] lista = (T[])new Object[pojemnosc];
		rozmiar = 0;
	}
	
	void dodajElement(T element){
		try {
			customException(rozmiar,pojemnosc);
		}
		catch(Exception e){
			System.out.println("Brak miejsca w tablicy!");
		}
		if(rozmiar+1<pojemnosc) {
			lista[rozmiar-1] = element;
			Arrays.sort(lista);
			rozmiar++;
		}

	}
	
	
	void zdejmijElement() {
		for(int i=0;i<rozmiar;i++) {
			lista[i] = lista[i+1];
		}
		rozmiar=rozmiar-1;
	}
	
	T pobierzElement() {
		top = lista[0];
		return top;
	}
	
	int getRozmiar(){
		return rozmiar;
	}
	
	public String toString() {
		String str;
		str = String.valueOf(lista);
		return str;
	}
	void customException(int rozmiar,int pojemnosc) throws Exception {
	    if(rozmiar+1>=pojemnosc)
	    	throw new Exception();
	  }
}
