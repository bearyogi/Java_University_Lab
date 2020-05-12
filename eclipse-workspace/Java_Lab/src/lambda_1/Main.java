package lambda_1;
import java.util.*;
import java.util.function.Function;
public class Main {
	public static void main(String[] args) {
	Function<Double, Double> oblicz = n -> n * n - 2 * n + 6;
	Inter inter = (suma, y) -> {return suma + y;};
	List<Double> list = Arrays.asList(11.5, -2.5, 42.0, 18.5, 56.5);
	double x, sum = 0;
	for(Double n : list) {
	    x = oblicz.apply(n);
	    sum = inter.dodaj(sum, x);
	}
	System.out.println("\n" + sum);
	}
}
