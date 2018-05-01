/**
 * Validacion de una matriz, imprimiendo el valor 1 si es simétrica o 0 si no lo es
 */
package matriz_simetrica;
import java.util.Scanner;
/**
 * @author Yesica Martin
 */
public class Matriz_Simetrica {
    
    private static int [] mat;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        int matriz [][] = new int [4][4];
        
        // Llamado de otros metodos
        Scanner entrada = new Scanner(System.in);
        Matriz_Simetrica.leermatriz(mat);
        
        
        
    }
     /**
     * @param mat the command line arguments
     * 
     */
    private static void leermatriz (int[] mat, Scanner entrada){
   
        for (int i=0; i<=3; i++)
            {
                for (int j=0; j<=3; j++)
                {
                    System.out.print("Introduzca el elemento [" + i + "," + j + "]");
                    mat[i][j] = entrada.nextInt(); 
                }
            }
        /*for (int i = 0; i < mat.length; i++) {
           // int j = mat[i];
            for (int j = 0; j < mat.length; j++) {
                //int k = mat[j];
                System.out.println("");
            }
            
        }*/
        
    } 
    
    /**
     * @param matr the command line arguments
     */
    public static void imprimirmatriz (int[] matr){
        
        
        for (int i=0; i<=3; i++){
            for (int j=0; j<=3; j++){
                System.out.print("-----------------------------");
                System.out.println(" "+ i + j +" ");
                System.out.print("-----------------------------");
            }
        }
    }
    
}
