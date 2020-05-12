package pc_preview_simulation_res;

public class Procesor {
	String model;
	int ileProc;
	double taktowanie;
	
	public Procesor(String model,int ileProc,double taktowanie){
		this.model = model;
		this.ileProc = ileProc;
		this.taktowanie = taktowanie;
	}
	public void get() {
		System.out.print("Model: " + model + " liczba w¹tków: " + ileProc + " taktowanie: " + taktowanie);
		System.out.println();
	}
}