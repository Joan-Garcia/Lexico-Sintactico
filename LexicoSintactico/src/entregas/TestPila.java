
package entregas;

import estructurasDeDatos.Nodo;
import estructurasDeDatos.Pila;

public class TestPila {
  public static void main(String[] args) {
    Pila p =  new Pila();
    
    System.out.println("Pila: ");
    p.mostrarPila();
    
    System.out.println("Push: inicio");
    p.push(new Nodo("inicio"));
    
    System.out.println("Pila: ");
    p.mostrarPila();
    
    System.out.println("Ciclo push: programa program");
    String[] s = {" ", "programa", "program", " ", "h"};
    p.cicloPush(s);
    
    System.out.println("Pila: ");
    p.mostrarPila();
    
    System.out.println("Tope: "+p.getTope().getInfo());
    System.out.println("Fondo: "+p.getFondo().getInfo());
    
    System.out.println("Pop");
    p.pop();
    
    System.out.println("Pila: ");
    p.mostrarPila();
    System.out.println("Tope: "+p.getTope().getInfo());
    System.out.println("Fondo: "+p.getFondo().getInfo());
    
    System.out.println("Pop");
    p.pop();
    
    System.out.println("Pila: ");
    p.mostrarPila();
    System.out.println("Tope: "+p.getTope().getInfo());
    System.out.println("Fondo: "+p.getFondo().getInfo());
    
    System.out.println("Pop");
    p.pop();
    
    System.out.println("Pila: ");
    p.mostrarPila();
    System.out.println("Tope: "+p.getTope().getInfo());
    System.out.println("Fondo: "+p.getFondo().getInfo());
  }
}
