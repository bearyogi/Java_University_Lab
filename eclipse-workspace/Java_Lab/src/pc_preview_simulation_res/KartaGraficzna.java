package pc_preview_simulation_res;

public class KartaGraficzna {
	String model;
	int ileRam;
	int taktowanie;
	
	public KartaGraficzna(String model, int ileRam, int takowanie){
		this.model = model;
		this.ileRam = ileRam;
		this.taktowanie = takowanie;
	}
	public void get() {
		System.out.print("Model: " + model + " ilo�� RAM: " + ileRam + " taktowanie: " + taktowanie);
		System.out.println();
	}
}