/**
 * Recibir daros por teclado y luego sacar el promedio de los mismos
 */
package media_con_metodos;
import java.util.Scanner;
/**
 *
 * @author Yesica
 */
public class Media_con_Metodos {

    public static double[] vec;
    private static double[] v;
    private static double[] vect;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        double vector [] = new double [10];
        double promedio;
        Scanner entrada = new Scanner(System.in);
       //Implementacion de otros metodos
        Media_con_Metodos.leer_vector(vec);
        //System.out.print("-----------------------------");
        //System.out.println(" " + Media_con_Metodos.calcular_media (v) + " ");
        promedio = Media_con_Metodos.calcular_media (v);
        Media_con_Metodos.imprimir_vector(vect);
        System.out.println ("Promedio:        " + promedio + " ");
    }

    /**
     *
     * @param vec the command line arguments
     */
    public static void leer_vector (double[] vec, Scanner entrada){
        //Declaracion de variables
        
        int n;
        //Lectura de datos
        for (n=0; n <= 9; n ++)
        {
            System.out.print("Digite numero: ["+ n +"]");
            vec[n] = Double.parseDouble(entrada.nextLine());
        }
    }
    
     /**
     *
     * @param v the command line arguments
     * @return 
     */
    
     public static double calcular_media (double[] v){
        //Declaracion de variables
        double sumatoria, prom;
        int i;
        //Proceso
        sumatoria = 0;
        for (i=0; i <= 9; i ++)
        {
            sumatoria = (sumatoria + v[i]);
        }
        prom = (sumatoria/i);
        return prom;
    } 
     
      /**
     *
     * @param vect the command line arguments
     */
     public static void imprimir_vector (double[] vect){
        //Declaracion de variables
        int x;
        //Proceso
        for (x=0; x <= 9; x ++)
        {
            System.out.print("-----------------------------");
            System.out.println(" "+ vect[x] +" ");
            System.out.print("-----------------------------");
        }
    }
}