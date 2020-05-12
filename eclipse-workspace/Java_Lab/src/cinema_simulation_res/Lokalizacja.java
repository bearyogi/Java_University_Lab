package cinema_simulation_res;

public class Lokalizacja {
	public static int ileMiast = 5;
	public static String tabAdres[] = new String[] {"Kielce", "Kraków", "Wroc³aw", "Warszawa", "Gliwice"};
	 Lokalizacja(){
	 }
	 public static boolean isSame(String wpis) {
		 for(int i=0;i<ileMiast;i++)
		 {
			 if( wpis.equals(tabAdres[i]) == true )
				 return true;
		 }
	
		 return false;
	 }
}