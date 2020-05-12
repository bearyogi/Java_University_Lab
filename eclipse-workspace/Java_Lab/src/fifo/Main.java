package fifo;
public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		FIFO<Double> lista = new FIFO<Double>();
		lista.dodaj(2.5);
		lista.dodaj(3.45);
		lista.wyjmij();
		lista.usun();
		System.out.println(lista);
	}

}
