package pc_preview_simulation_res;

public class Dysk {
	String model;
	int pojemnosc;
	
	public Dysk(String model, int pojemnosc){
		this.model = model;
		this.pojemnosc =  pojemnosc;
	}
	public void get() {
		System.out.print("Model: " + model + " pojemnoœæ: " + pojemnosc);
		System.out.println();
	}
	}