package lambda_2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Consumer;
public class Main {
	
	
	public static void main(String[] args) {
		
		Student Adam = new Student("Adam","xyz",20);
    	Student Kamil = new Student("Kamil","Kowalski",10);
        List<Student> lista = Arrays.asList(Adam,Kamil);

        List<Student> result = lista.stream()               
                .filter(a -> !a.otherThanXyz())    
                .collect(Collectors.toList());             

        result.forEach(System.out::println);  
        
		printStudents(lista);
		printConsumer(lista);
	
		
	}
	
	
	public static void printStudents(List<Student> students) {
	    for (int i = 0; i<students.size() ; i++){
	        System.out.println(students.get(i).getName());
	    }
	}
	
	public static void printConsumer(List<Student> students) {

	    	Consumer<Student> listastudent = n -> System.out.println(n.getName());
	    	students.forEach(listastudent);
	    
	}

}



