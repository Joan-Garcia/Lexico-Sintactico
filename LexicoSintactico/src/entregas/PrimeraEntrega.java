package entregas;

import datos.Gramatica;

public class PrimeraEntrega {
  private final Gramatica gramatica;
  
  public PrimeraEntrega(){
    gramatica = new Gramatica();
  }
  
  public void procesaEImprime(){
    gramatica.prepararGramatica();
    
    System.out.println("Primera entrega de analizador sintáctico");
    
    System.out.println("\n--- Gramática ---");
    imprimeArreglo(gramatica.getGramatica());
    System.out.println("\n--- Lado derecho ---");
    imprimeArreglo(gramatica.getLadoDerecho());
    System.out.println("\n--- No terminales ---");
    imprimeArreglo(gramatica.getNoTerminales());
    System.out.println("\n--- Terminales ---");
    imprimeArreglo(gramatica.getTerminales());
    
    System.out.println("\nFin de la ejecución.");
  }
  
  private void imprimeArreglo(String[] a){
    for (String cadena : a) 
      System.out.println(cadena);  
  }
  
  public static void main(String[] args) {
    PrimeraEntrega programa = new PrimeraEntrega();
   
    programa.procesaEImprime();
  }
}
