package Pilas;
//import java.util.Scanner;
//import java.util.Stack;
import javax.swing.JOptionPane;
//import java.lang.NumberFormatException;
//import java.lang.Exception;
/*
 * @author Yesica Martin
 */
public class Principal {

    public static void main(String[] args) {
        
        //Scanner PILA_DINAMICA = new Scanner(System.in);
        PilaDinamica pl = new PilaDinamica();
        int opcion = 0;
        int elemento = 0;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "\t\tPILA DINAMICA\n"
                        + "\t1. Crear Pila\n"
                        + "\t2. Insertar elemento en la cima\n"
                        + "\t3. Quitar elemento de la pila\n"
                        + "\t4. Mostrar elemento de la cima\n"
                        + "\t5. Obtener copia del elemento de la cima\n"
                        + "\t6. Mostrar copia\n"        
                        + "\t7. Tamaño de la pila\n"
                        + "\t8. Vaciar la pila\n"
                        + "\t9. Comprobar si esta vacia\n"
                        + "\t10. Salir\n"
                        + "Elige una opcion",JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1://Crear Pila 
                        if(pl.estaVacia()){
                            JOptionPane.showMessageDialog(null,"Pila creada ", "Ya tienes una nueva pila",
                            JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Ya hay una pila creada ", "No se puede crear pila ",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2://Insertar elemento en la cima
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresar dato para el nuevo elemento de la cima: ", JOptionPane.INFORMATION_MESSAGE));
                        pl.insertarElemento(elemento);

                        /*System.out.println("\tINSERTAR ELEMENTO");
                        System.out.print("Ingresar dato para el nuevo elemento de la cima:\t");
                        int elemento = entrada.nextInt();
                        pl.insertarElemento(elemento);*/

                        break;
                    case 3://Quitar elemento de la pila
                        if(!pl.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es (" + pl.quitarElemento()+ ")",
                            "Obeteniendo datos de la pila", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia ","Pila vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }

                        /*System.out.println("\tQUITAR ELEMENTO DE LA PILA");
                        System.out.print("Se elimino el elemento de la cima\n");
                        pl.quitarElemento();*/

                        break;
                    case 4://Mostrar elemento de la cima
                        if(!pl.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: ("+ pl.cima() + ")",
                            "Elemento de la cima", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay elementos para mostrar ",
                            "Pila vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }

                        /*System.out.println("\tMOSTRAR ELEMENTO DE LA CIMA");
                        System.out.println("Ultimo elemento de la pila:\t");
                        System.out.print(pl.cima()+"\n");*/

                        break;
                    case 5://Obtener copia
                        if(!pl.estaVacia()){
                            pl.copiaCima();
                            JOptionPane.showMessageDialog(null, "El elemento copiado de la cima ",
                            "Elemento de la cima", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay elementos para sacar copia ",
                            "Pila vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6://Mostrar copia    
                        if(!pl.estaVacia()){
                            pl.mostrarCopia();
                            JOptionPane.showMessageDialog(null, "El elemento copiado ",
                            "Elemento de la cima", JOptionPane.INFORMATION_MESSAGE);
                            pl.mostrarCopia();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay elementos para mostrar ",
                            "Pila vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7://Tamaño de la pila
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es de (" + pl.tamaPila() + ") elementos", 
                        "Tamaño de la pila ", JOptionPane.INFORMATION_MESSAGE);

                        /*System.out.println("\tOBTENER COPIA DEL ELEMENTO DE LA CIMA");
                        System.out.println("Elemento copiado:\t");
                        System.out.print(pl.copiaCima());*/
                        break;
                    case 8://Vaciar la pila
                        if(!pl.estaVacia()){
                            pl.vaciarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado ",
                                "Vaciando pila ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que vaciar ",
                                "Pila vacia ", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 9://Comprobar si esta vacia
                        if(pl.estaVacia()){
                            JOptionPane.showMessageDialog(null,"La pila esta vacia ", "Pila vacia ", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia ", "La pila contiene datos ",
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        /*System.out.println("\tCOMPROBAR PILA VACIA");
                        pl.estaVacia();*/
                        break;
                    case 10://Salir
                        JOptionPane.showMessageDialog(null, "Aplicación pila dinámica finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                
            }  
            catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                }
        }
        while (opcion!=10);   
    }
}    
