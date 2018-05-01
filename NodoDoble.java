/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

/**
 *
 * @author Yesica Martin
 */
public class NodoDoble {
    //Nodo principal
    private Integer dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;
    
}

public void insertarInicio(Integer d){
    //Método Insertar inicio
    NodoDoble nuevo = new NodoDoble(d);
    if(inicio==null){
        inicio=nuevo;
    }else{
        nuevo.setSiguiente(inicio);
        inicio.setAnterior(nuevo);
        inicio=nuevo;
    }
}

public void insertarFinal(Integer d){
    //Método Insertar final
    NodoDoble nuevo = new NodoDoble(d);
    if(inicio == null){
        inicio = nuevo;
    }else{
        NodoDoble aux = inicio;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
        nuevo.setAnterior(aux);
    }          
}

public void eliminaValor(Integer valor){
    //Metodo Eliminar
    if (inicio != null){
        NodoDoble aux = inicio;
        NodoDoble ant = null;
        while (aux != null){
            if (aux.getDato() == valor ){
                if (ant == null){
                    inicio = inicio.getSiguiente();
                    aux.setSiguiente(null);
                    aux= inicio;
                                                          
                }else {
                    ant.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    aux = ant.getSiguiente();
                }                                             
            }else{
                ant = aux;
                aux = aux.getSiguiente();
            }
        }
    }
}

public void buscar(Integer valor){
    //Método buscar
    if (inicio != null){
        NodoDoble aux = inicio;
        int cont = 0;
        while (aux != null){
            if (aux.getDato() == valor ){
                cont++;
                aux = aux.getSiguiente();
            }   
        } 
    }
}

public void insertarOrdenado(Integer d){
    //Insertar ordenado
    NodoCircular nuevo=new NodoCircular(d);
    if(inicio==null){
        inicio=nuevo;
    }else{
        NodoCircular aux=inicio;
        NodoCircular ant=null;
        while((aux.getSiguiente()!=inicio)&&(aux.getDato()<nuevo.getDato())){
            ant=aux;
            aux=aux.getSiguiente();
        }
        if(ant==null){
            while(aux.getSiguiente()!=inicio){
                aux=aux.getSiguiente();
            }
            nuevo.setSiguiente(inicio);
            aux.setSiguiente(nuevo);
            inicio=nuevo;
        }else if(aux.getSiguiente()==inicio){
            ant=aux;
            ant.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }else{
            ant.setSiguiente(nuevo);
            nuevo.setSiguiente(aux);
        }
    }
}