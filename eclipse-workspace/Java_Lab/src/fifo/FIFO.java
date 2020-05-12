package fifo;
import java.util.*;
public class FIFO<E> {

  private LinkedList<E> lista = new LinkedList<E>();
  public E wyjmij() {
	    return lista.getFirst();
	  }
	  public int rozmiar() {
	    return lista.size();
	  }
  public void dodaj(E element) {
    lista.addLast(element);
  }
  public E usun() {
    if (lista.isEmpty()) {
      return null;
    }
    	return lista.removeFirst();
  }
  public Object[] zwroc() {
    Object[] kontener = new Object[lista.size()];
    for (int i = 0; i < kontener.length; i++) {
      kontener[i] = lista.get(i);
    }
    lista.clear();
    return kontener;
  }
public String toString() {
	String str = "";
	str = String.valueOf(lista);
	return str;
}
}