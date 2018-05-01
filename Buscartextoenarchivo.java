/*
 * Programa de busqueda de texto de archivo
 */
package buscartextoenarchivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
/**
 * @author Yesica Martin
 */
public class Buscartextoenarchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);
        //Para seleccionar el archivo
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);
        //Introducimos el texto a buscar
        System.out.print("Introduce texto a buscar: ");
        String texto = sc.nextLine();
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
                System.out.println("("+texto +")"+" No se ha encontrado el archivo");
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
    }
    
}
