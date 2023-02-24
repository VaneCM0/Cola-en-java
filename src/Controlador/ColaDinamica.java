package Controlador;

/**
 *
 * @author medin
 */
public class ColaDinamica <T>{
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamanio;
    
    public ColaDinamica(){
        primero = null;
        ultimo = null;
        tamanio=0;
    }
    
    public boolean isEmpty(){
        return primero==null;
    }
    
    public int size(){
        return tamanio;
    }
    
    public T primero(){
        if(isEmpty()){
          return null;
        }
          return primero.getElemento();
    }
    
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
         T elemento = primero.getElemento();
         Nodo <T> aux = primero.getSiguiente();
         primero = null;
         primero = aux;
         tamanio--;
         
         if(isEmpty()){
             ultimo = null;
         }
         return elemento;
    }
    
    public T enqueue(T elemento){
        Nodo <T> aux = new Nodo(elemento,null);
        if(isEmpty()){
           primero=aux;
           ultimo=aux;
         }
        else{
            if(size()==1){
              ultimo = aux;
              primero.setSiguiente(aux);
    }
            else{
            ultimo.setSiguiente(aux);
            }
            ultimo=aux;
        }
        tamanio++;
        return aux.getElemento();
    }
    
    @Override
    public String toString(){
        if(isEmpty()){
            return "La lista está vacia";
        }
        else{
            String s="";
            Nodo<T> aux = primero;
            while(aux!= null){
                s+=aux;
                aux=aux.getSiguiente();
            }
            return s;
        }
        
    }
}
