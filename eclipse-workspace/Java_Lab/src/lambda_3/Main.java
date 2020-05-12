package lambda_3;

public class Main {
	static IPodatek obliczPodatek = (stawka, podstawa) -> {if(podstawa>85528)return (podstawa*(stawka + 7))/100; else return  (podstawa*stawka)/100;};
	public static void main(String[] args) {
	int stawka = 22;
	int dochod = 60000;
	int dochod2 = 87000;
	System.out.println(obliczPodatek.obliczPodatek(stawka, dochod));
	System.out.println(obliczPodatek.obliczPodatek(stawka, dochod2));
	}
	

}