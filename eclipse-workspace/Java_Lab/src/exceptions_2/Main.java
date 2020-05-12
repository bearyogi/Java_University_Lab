package exceptions_2;


public class Main {
  void canThrowException(int liczba) throws Exception {
    if(liczba>2)
    	throw new Exception();
  }
 
  public static void main(String[] args) {
	  System.out.println("wyrzuc wyjatek jesli liczba wieksza niz 2");
  Main ev = new Main();
    int liczba = 1;
    try {
      ev.canThrowException(liczba);
      liczba++;
      ev.canThrowException(liczba);
      liczba++;
      ev.canThrowException(liczba);
      liczba++;
    }
    
    catch (Exception e) {
    	System.out.println("Wyj¹tek zosta³ wyrzucony w instrukcji: " + liczba);
    }
    if(liczba<3)
    	System.out.println("wyjatek nie zostal wyrzucony");
  }
}