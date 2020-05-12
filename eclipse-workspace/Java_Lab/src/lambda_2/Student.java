package lambda_2;

public class Student {
public String Imie;
public String Nazwisko;
public int Wiek;
Student(String Imie, String Nazwisko, int Wiek){
	this.Imie = Imie;
	this.Nazwisko = Nazwisko;
	this.Wiek = Wiek;
}

public String getName() {
	return Imie +" " + Nazwisko;
}
public String getNazwisko() {
	return Nazwisko;
}
public int getWiek() {
	return Wiek;
}
public boolean otherThanXyz() {
	return this.Nazwisko.equals("xyz");
}
public String toString() {
	return this.Imie + " " + this.Nazwisko;
}
}
