/*
 *Insertar datos al final del archivo
 */
package insertardatos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * @author Yesica Martin
 */
public class InsertarDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        try(FileWriter fw = new FileWriter("c:/ficheros/datos.txt", true);
        PrintWriter salida = new PrintWriter(fw))
            {
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN");
               cadena = sc.nextLine();
               while (!cadena.equalsIgnoreCase("FIN"))
               {
                   salida.println(cadena);
                   cadena = sc.nextLine();
               }
            }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
                
        
    }
    
}