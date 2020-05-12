package cinema_simulation_res;

import cinema_simulation_res.Dane;

public class DaneRezerwacji extends Dane {
	public String email = "";
	public String nrTel = "";
	DaneRezerwacji(){
		super();
	}
public DaneRezerwacji(String imie, String nazwisko)
{
	super(imie,nazwisko);
}
	public String getImie() {
		return super.getImie();
	}
	public String getNazwisko() {
		return super.getNazwisko();
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNrTel(String nrTel) {
		this.nrTel = nrTel;
	}
	public String getEmail() {
		return email;
	}
	public String getNrTel() {
		return nrTel;
	}
}
