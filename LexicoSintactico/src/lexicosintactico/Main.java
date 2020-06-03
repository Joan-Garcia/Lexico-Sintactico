package lexicosintactico;

import analizadorlexico.AnalizadorLexico;
import datos.Archivo;
import datos.Gramatica;
import estructurasDeDatos.Pila;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Gramatica gramatica;
    AnalizadorLexico analizadorLexico;
    Pila pila;
    LexicoSintactico analizadorLexicoSintactico;
    
    gramatica = new Gramatica(new Archivo());
    System.out.println("Selecciona archivo de gramática");
    gramatica.prepararGramatica();
    
    System.out.println(Arrays.toString(gramatica.getNoTerminales()));
    System.out.println(Arrays.toString(gramatica.getTerminales()));
    
    System.out.println("Selecciona archivo de programa");
    analizadorLexico = new AnalizadorLexico(new Archivo().leerArchivo());
    pila = new Pila();
    
    analizadorLexicoSintactico = new LexicoSintactico(gramatica, pila,
                                                      analizadorLexico);
    
    analizadorLexicoSintactico.LlDriver();
  }
}
