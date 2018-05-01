/*
 * Manejo de archivos, implementando un menu de opciones, donde por medio de metodos se ejecutan las acciones tomadas por consola
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Yesica Martin
 */
public class ManejoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int opcion = 0;//Declaracion de la variable
        
        while (opcion!=7) //Inicio del ciclo while
        { 
            Scanner sc = new Scanner (System.in); 
            //Impresion de menu opciones por pantalla
            System.out.println("*****************************************");
            System.out.println("            Manejo de archivos           ");
            System.out.println("*****************************************");
            System.out.println("1. Crear archivo");
            System.out.println("2. Leer todo el archivo");
            System.out.println("3. Escribir en el archivo");
            System.out.println("4. Buscar texto en archivo");
            System.out.println("5. Modificar texto");
            System.out.println("6. Eliminar archivo");
            System.out.println("7. Salir");
            System.out.println("*****************************************");

            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:// Crear archivo
                {
                    System.out.println("*****************************************");
                    PrintWriter salida = null;
                    try 
                    {
                        salida = new PrintWriter("c:/ficheros/datos.txt");
                      /*  String cadena;
                        System.out.println("Escribe la palabra CREAR");
                        cadena = sc.nextLine();
                        while (!cadena.equalsIgnoreCase("CREAR"))
                        {
                        salida.println(cadena);
                        cadena = sc.nextLine();
                        }*/
                        System.out.println("Archivo creado en c:/ficheros/datos.txt");
                        //salida.flush();
                    } 
                    catch (FileNotFoundException e)
                    {
                       System.out.println(e.getMessage());
                    }
                        finally 
                        {
                        salida.close();
                        }
                    break;//Para que cumpla con el caso y regrese al ciclo while
                }
                case 2: // Leer todo el archivo
                {
                    System.out.println("*****************************************");
                    FileReader fr = null;
                    try 
                    {
                        fr = new FileReader("c:/ficheros/datos.txt");

                        BufferedReader entrada = new BufferedReader(fr);
                        String cadena = entrada.readLine();//Se lee la primera linea
                        while (cadena != null) // mientras no se llegue al final
                        {
                            System.out.println(cadena); // se muestra por pantalla
                            cadena = entrada.readLine(); //se lee la siguiente línea
                        }
                    } catch (FileNotFoundException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    catch (IOException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    finally 
                    {
                        try
                        {
                        if (fr != null) 
                            {
                                fr.close();
                            }   

                    } catch (IOException e) 
                            {
                                System.out.println(e.getMessage());
                            }
                    }
                    break;
                }
                case 3: // Escribir en el archivo
                {
                    System.out.println("*****************************************");
                    String cadena;
                    try(FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
                    PrintWriter salida = new PrintWriter(fw))
                        {
                        System.out.println("Introduce texto."); 
                        System.out.println("Para acabar introduce la palabra FIN:"); 
                           cadena = sc.nextLine();
                           while (!cadena.equalsIgnoreCase("FIN")) //Al digitar la palabra fin, termina el ciclo while y escribe todo lo anterior en el archivo
                           {
                               salida.println(cadena);
                               cadena = sc.nextLine();
                           }
                        }
                    catch (IOException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 4: // Buscar texto en archivo
                {
                    System.out.println("*****************************************");
                    Scanner entrada = null;
                    String linea;
                    int numeroDeLinea = 1;
                    boolean contiene = false;
                    //Para seleccionar el archivo
                    JFileChooser j = new JFileChooser();
                    j.showOpenDialog(j);
                    //Introducimos el texto a buscar
                    System.out.print("Introduce texto a buscar: ");
                    String texto = sc.nextLine();
                    texto = sc.nextLine();
                    try
                    {
                        //Guardamos el path del ficheroen la variable ruta
                        String ruta = j.getSelectedFile().getAbsolutePath();
                        //Creamos un objeto File asociado al fichero seleccionado
                        File f = new File(ruta);
                        //Creamos un Scanner para leer el fichero
                        entrada = new Scanner(f);
                        //Mostramos el nombre del fichero
                        System.out.println("Archivo: "+ f.getName());
                        //Mostramos el texto a mostrar
                        System.out.println("Texto a buscar: "+ texto);
                        while (entrada.hasNext())
                        {
                            //Mientras no se llegue al final del fichero
                            linea = entrada.nextLine(); //Se lee una linea
                            if (linea.contains(texto))
                            {
                                //Si la linea contiene el texto buscado, mostrara true
                                System.out.println("Linea "+ numeroDeLinea + ": "+ linea);
                                contiene = true;
                            }
                            numeroDeLinea++; //Se incrementa el contadot de lineas
                        }
                        if (!contiene)
                        {
                            //Si el archivo no contien el texto se muestra un mensaje
                            System.out.println(texto +"No se ha encontrado el archivo");
                        }
                    }
                    catch (FileNotFoundException e)
                    {
                        System.out.println(e.toString());
                    }
                    catch (NullPointerException e)
                    {
                        System.out.println(e.toString() + "No ha seleccionado ningun archivo");
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.toString());
                    }
                    finally
                    {
                        if (entrada != null)
                        {
                            entrada.close();
                        }
                    }
                    break;
                }
                case 5: // Modificar archivo
                {
                    System.out.println("*****************************************");
                    
                    
                    File FficheroAntiguo = null;
                    String Satigualinea = null;
                    String Snuevalinea = null;
                    
                    //sc = new Scanner (Snuevalinea);
                    /*Obtengo un numero aleatorio*/
                    Random numaleatorio= new Random(3816L); 
                    /*Creo un nombre para el nuevo fichero apartir del
                     *numero aleatorio*/
                    String SnombFichNuev = FficheroAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
                    /*Crea un objeto File para el fichero nuevo*/
                    File FficheroNuevo = new File(SnombFichNuev);
                    try {
                        /*Si existe el fichero inical*/
                        if(FficheroAntiguo.exists()){
                            /*Abro un flujo de lectura*/
                            BufferedReader Flee= new BufferedReader(new FileReader(FficheroAntiguo));
                            /*BufferedWriter br = new BufferedWriter(new FileWriter(FficheroNuevo,Snuevalinea));*/
                            
                            String Slinea = null;
                            Scanner entrada = new Scanner (Slinea);
                            /*Recorro el fichero de texto linea a linea*/
                            while((Slinea = Flee.readLine())!=null) { 
                                /*Si la lia obtenida es igual al la bucada
                                 *para modificar*/
                                if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                                   /*Escribo la nueva linea en vez de la que tenia*/
                                   sc = new Scanner(Snuevalinea);
                                    /*BufferedWriter fw = new */Snuevalinea = sc.nextLine(/*FficheroNuevo/*,Snuevalinea*/);
                                    
                                }else{
                                    /*Escribo la linea antigua*/
                                    /*BufferedWriter fw = new */Slinea = entrada.nextLine();
                                }             
                            }
                            /*Obtengo el nombre del fichero inicial*/
                            String SnomAntiguo = FficheroAntiguo.getName();
                            /*Borro el fichero inicial*/
                            FficheroAntiguo.delete();
                            /*renombro el nuevo fichero con el nombre del 
                            *fichero inicial*/
                            FficheroNuevo.renameTo(FficheroAntiguo);
                            /*Cierro el flujo de lectura*/
                            Flee.close();
                        }else{
                            System.out.println("Fichero No Existe");
                        }
                    } catch (Exception ex) {
                        /*Captura un posible error y le imprime en pantalla*/ 
                         System.out.println(ex.getMessage());
                    }
                
                    /*System.out.println("*****************************************");
                    System.out.println("Esta funcion no tiene codigo para ejecutar\n   Intente elegir una opcion diferente");*/
                    break;
                }
                
                case 6: // Eliminar texto
                {
                    System.out.println("*****************************************");
                    JFileChooser j = new JFileChooser();
                    j.showOpenDialog(j);

                    String ruta = j.getSelectedFile().getAbsolutePath();
                    File f = new File(ruta);

                    if (f.delete())
                    System.out.println("El fichero ha sido borrado satisfactoriamente");
                    else
                    System.out.println("El fichero no pudó ser borrado");
                }
                
            } //Fin del switch2
         if (opcion>7)   //Validacion de la opcion elegida
         {
             System.out.println("*****************************************");
             System.out.println("Ingrese una opcion valida");
         }
            
        }// Fin del ciclo while      
    }  
}    
        

    

