package Pilas;

public class PilaDinamica{

    private Pila cima;
    int tama;
    
    //Metodo contructor
    public PilaDinamica(){
        cima = null;
        tama = 0;
    }
    
    //Crear pila
    /*public boolean crearPila(){
        if (cima == null){
           return cima == null; 
        }
    }*/
    
    //Metodo para comprobar que la pila esta vacia
    public boolean estaVacia(){
        if(cima == null){
        }
        return cima == null;
    }
    
    //Matodo para insertar un elemento en la pila (PUSH)
    public void insertarElemento(int elemento){
        Pila nuevo = new Pila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tama++;
    }
    
    //Metodo para quitar un elemento de la pila (POP)
    public int quitarElemento(){
        int auxiliar = cima.dato;
        cima = cima.siguiente;
        tama--;
        return auxiliar;
    }
    
    //Metodo para saber que elemento esta en la cima
    public int cima(){
        return cima.dato;
    }
    
    //Metodo para copiar el ultimo elemento de la cima
    public void copiaCima(){
        int temporal = 0, auxiliar;
            temporal = cima.dato;
            auxiliar = cima.dato;
            cima = cima.siguiente;
            //cima.dato = auxiliar;
            this.tama--;
    }
    
    //Metodo mostrar copia
    public void mostrarCopia(){
        if(!estaVacia()){
            copiaCima();
        }
    }

    //Metodo para saber el tamaño de la pila
    public int tamaPila(){
        return tama;
    }
    
    //Metodo para vaciar toda la pila
    public void vaciarPila(){
        while(!estaVacia()){
            quitarElemento();
        }
    }
}
