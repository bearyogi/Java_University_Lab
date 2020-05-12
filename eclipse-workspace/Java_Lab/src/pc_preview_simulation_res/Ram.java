package pc_preview_simulation_res;

public class Ram {
	String model;
	int ileRam;
	public Ram(String model, int ileRam){
		this.model = model;
		this.ileRam = ileRam;
}
	public void get() {
		System.out.print("Model: " +model + " iloœæ RAM: " + ileRam);
		System.out.println();
	}
}