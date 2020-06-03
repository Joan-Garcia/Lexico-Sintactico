package estructurasDeDatos;

/**
 * Pila de nodos que almacenan como información < String >
 * 
 * @author Miguel
 */
public class Pila{
    Nodo ultimo;
    Nodo inicial;
    boolean vacia; 
   
    public Pila(){
        inicial = ultimo = null;
    }

    public String pop(){        
        String x;
        x = (String) ultimo.getInfo();
        if(!esVacia()){
            if(inicial==ultimo){
                inicial=ultimo=null;
            }else{
                Nodo auxNodo = inicial; 
                    while (auxNodo.getSiguiente()!=ultimo)
                        auxNodo = auxNodo.getSiguiente();                    
                    
                ultimo = auxNodo;
                ultimo.setSiguiente(null);
            }
        }else{
            System.out.println("Sin datos");
        }  
        return x;
    }
    
    void push(String dato){
        if(!esVacia()){
            ultimo.setSiguiente(new Nodo(dato));
            ultimo = ultimo.getSiguiente();
        }else{            
            inicial = ultimo = new Nodo(dato);
        }
    }

    void cicloPush(String [] datos){            
        for (int i =0; i < datos.length; i++) {
            if(datos[i]!=null && datos[i]!=" ")
                push(datos[i]);
        }
    }
        
    void mostrarPila(){
        Nodo aux = inicial;
        
        while(aux != null){
            System.out.print("["+aux.getInfo()+"] ");
            aux = aux.getSiguiente();    
        }
        
    }
    
    boolean esVacia(){
        if(inicial == null) vacia = true;
        else vacia = false;
        
        return vacia;
    }
}
