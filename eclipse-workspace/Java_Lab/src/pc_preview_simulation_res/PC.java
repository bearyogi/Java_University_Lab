package pc_preview_simulation_res;

public class PC {
	 public String obudowa;
	  public int cena;
	  public  Procesor procesor;
	  public  KartaGraficzna kartaGraficzna;
	  public Zasilacz zasilacz;
	  public Ram ram;
	  public Dysk dysk;

	  public PC(String obudowa, int cena, Procesor procesor,  KartaGraficzna kartaGraficzna, Zasilacz zasilacz, Ram ram,Dysk dysk) {
	   this.obudowa = obudowa;
	   this.cena = cena;
	   this.procesor = procesor;
	   this.kartaGraficzna = kartaGraficzna;
	   this.zasilacz = zasilacz;
	   this.ram = ram;
	   this.dysk = dysk;
		  
	  }
	  //...
	  public void komponenty(int wybor) {
		  switch (wybor) {
		  case 1:
			  System.out.println(obudowa);
			  break;
			  
		  case 2:
			  System.out.println(cena);
			  break;
			  
		  case 3:
			  procesor.get();
			  break;
		  case 4:
			  kartaGraficzna.get();
			  break;
		  case 5:
			  zasilacz.get();
			  break;
		  case 6:
			  ram.get();
			  break;
		  case 7:
			  dysk.get();
			  break;
			  
			  default:
				  System.out.println("z³y wybór!");
			  
		  }
	  }
	}