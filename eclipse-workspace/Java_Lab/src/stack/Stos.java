package stack;
import java.util.*;


public class Stos<E> {
 private LinkedList<E> lista;

 public Stos() {
  lista = new LinkedList<E>();
 }
 
 public void push(E element) {
  lista.add(element);
 }

 public E pop() {
  return lista.removeLast(); 
 }
 
 public boolean czyPusty() {
  return (lista.isEmpty());
 }
 
 public E peek() {
  return lista.getLast();
 }
 
 public void wyswietl() {
  System.out.println(lista);
 }
 
 public int rozmiar() {
  return lista.size(); 
 }
 public String toString() {

	 return String.valueOf(lista);

 }
}