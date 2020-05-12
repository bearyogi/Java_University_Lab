package stack;

public class Main {

	public static void main(String[] args) {
			    
			  Stos<String> s = new Stos<String>(); 
			  s.push("Ala");
			  s.push("Ola");
			  s.push("Marcin");
			  s.wyswietl();
			  System.out.println(s.peek());   
			  s.pop();     
			  s.wyswietl();    
			  System.out.println (s.rozmiar());
	
	}

}
