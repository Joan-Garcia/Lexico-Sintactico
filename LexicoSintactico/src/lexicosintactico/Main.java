package lexicosintactico;

import analizadorlexico.AnalizadorLexico;
import datos.Archivo;
import datos.Gramatica;
import estructurasDeDatos.ListaEnlazada;
import estructurasDeDatos.Pila;

public class Main {
  Gramatica gramatica;
  AnalizadorLexico analizadorLexico;
  Pila pila;
  LexicoSintactico analizadorLexicoSintactico;
  ListaEnlazada temp;
  
  public Main(){
    gramatica = new Gramatica(new Archivo());
    pila = new Pila();
  }
  
  private void procesa() throws Exception{
    analizadorLexicoSintactico = new LexicoSintactico(gramatica, pila,
                                                      analizadorLexico);
    
    analizadorLexicoSintactico.LlDriver();
  }
  
  private void captura(){
    System.out.println("Selecciona archivo de gramática");
    gramatica.prepararGramatica();
    
    System.out.println("Selecciona archivo de programa");
    analizadorLexico = new AnalizadorLexico(new Archivo().leerArchivo());
  }
  
  private void resultados(){
    //Impresión de la tabla de símbolos:
    temp = (ListaEnlazada) analizadorLexico.getTablaSimbolos().get(0).getInfo();
    String[] s1 = temp.toArray();
    temp = (ListaEnlazada) analizadorLexico.getTablaSimbolos().get(1).getInfo();
    String[] s2 = temp.toArray();
    
    System.out.println("\nTabla de Simbolos");
    System.out.printf("%-20s%-20s\n", "Lexema", "Clasificación");
    System.out.println("----------------------------------");
    for(int i = 0; i < s1.length; i++)
      System.out.printf("%-20s%-20s\n", s1[i], s2[i]);
    System.out.println("");
  }
  
  public static void main(String[] args) {
    Main m = new Main();
    
    try{
      m.captura();
      m.procesa();
      m.resultados();
    }catch(Exception e){
      System.out.println(">>>Analisis terminado por error.");
    }
  }
}
