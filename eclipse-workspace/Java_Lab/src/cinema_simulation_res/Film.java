package cinema_simulation_res;

public class Film {
	public static int ileFilm = 5;
	public static String tabTytul[] = new String[] {"Szcz�ki 10", "Pi�a", "Mi�", "Shrek","James Bond"};
	public int nrSal[] = new int[] {1,2,3,4,5};
	public Film(){
	 }
	 public static int isSame(String wpis) {
		 for(int i=0;i<ileFilm;i++)
		 {
			 if( wpis.equals(tabTytul[i]) == true )
				 return i;
		 }
	
		 return 0;
	 }
	 public String toString() {
		 return String.format("Biblioteka film�w na dzi�");
	 }
}
