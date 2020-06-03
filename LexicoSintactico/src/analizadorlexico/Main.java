package analizadorlexico;

import datos.Archivo;
import estructurasDeDatos.ListaEnlazada;
import java.io.EOFException;

/*
  Prueba del analizador léxico token por token
*/
public class Main {
  public static void main(String[] args) {
    Archivo archivo;
    AnalizadorLexico lexico;
    ListaEnlazada temp;
    
    archivo = new Archivo();
    lexico = new AnalizadorLexico(archivo.leerArchivo());
    
    try {
      while(true){
        System.out.println(lexico.getToken());
      }
    } catch(EOFException e){
      System.out.println("Fin del archivo");
    } finally{
      //Impresión de la tabla de símbolos:
    temp = (ListaEnlazada) lexico.getTablaSimbolos().get(0).getInfo();
    String[] s1 = temp.toArray();
    temp = (ListaEnlazada) lexico.getTablaSimbolos().get(1).getInfo();
    String[] s2 = temp.toArray();
    
    System.out.println("\nTabla de Simbolos");
    System.out.printf("%-20s%-20s\n", "Lexema", "Clasificación");
    System.out.println("----------------------------------");
    for(int i = 0; i < s1.length; i++)
      System.out.printf("%-20s%-20s\n", s1[i], s2[i]);
    System.out.println("");
    }
    
  }
}
