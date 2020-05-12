package pc_preview_simulation_res;

public class Zasilacz {
	String model;
	int waty;
	
	public Zasilacz(String model, int waty){
		this.model = model;
		this.waty = waty;
	}
	public void get() {
		System.out.print("Model: " +model + " iloœæ wat: " + waty);
		System.out.println();
	}
}