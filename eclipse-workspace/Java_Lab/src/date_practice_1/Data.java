package date_practice_1;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
class Data {

	public static void main(String[] args) {
	
		while(true) {
			Scanner scan = new Scanner(System.in);
			 SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

	zmianaCzasu czas = new zmianaCzasu();
	System.out.println("1 - odczytywanie bie��cej daty");
	System.out.println("2 - przesu� dat� o tydzie� do ty�u");
	System.out.println("3 - przesu� dat� o tydzie� do przodu");
	int wybor = scan.nextInt();
	switch(wybor) {
	case 1:
		System.out.println("Aktualna data: " +sdf1.format(czas.getCzas()) );
		break;
	case 2:
		
		System.out.println("Data przesuni�ta o tydzie� do ty�u: " + sdf1.format(czas.tydzienMinus()));
		break;
		
	case 3:
		czas.tydzienPlus();
		System.out.println("Data przesuni�ta o tydzie� do przodu: " + sdf1.format(czas.tydzienPlus()));
		break;
		
		default:
			System.out.println("z�y wyb�r!");
	}
	scan.close();
	}

	}

	
}

class zmianaCzasu {
	private Date czas;
	zmianaCzasu(){
		czas = new Date();
	}
	zmianaCzasu(Date czas){
		this.czas = czas;
	}
	public Date getCzas() {
		czas = new Date();
		return czas;
	}
public Date tydzienPlus() {
		int plus = 7*24*60*60*1000;
		long timestamp = czas.getTime();
		Date dataPlus = new Date(timestamp+plus);
		return dataPlus;
	}
	public Date tydzienMinus() {
		int minus = 7*24*60*60*1000*(-1);
		long timestamp = czas.getTime();
		Date dataMinus = new Date(timestamp+minus);
		return dataMinus;
	}
}
