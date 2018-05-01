/**
 * Calcular la produccion de 3 obreros durante 6 meses, mostrar el promedio por obrero y tambien el promedio total
 */
package obreros_matrices;
import java.util.Scanner;
/**
 * @author Yesica Martin
 */
public class Obreros_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de variables
        String nombres [] = new String[3];
        int produccion [][] = new int [3][6];
        int ren, col, totProd, toTotProd;
        //Crear objeto para entrada de datos por el teclado
         Scanner entrada = new Scanner(System.in);
         System.out.println("-----------------------------------------");
         System.out.println("    PROCESAR LA PRODUCCION DE OBREROS     ");
         //Leer datos
          System.out.println("           Lectura de datos");
          
          for (ren = 0; ren <= 2; ren ++)
          {
              System.out.println("-----------------------------------------");
              System.out.print("Nombre del obrero "+ (ren+1) + ": ");
              nombres [ren] = entrada.nextLine();
              System.out.println("-----------------------------------------");
              for (col = 0; col <= 5; col ++)
              {
                System.out.print("Teclee produccion mes "+ ren +""+ col +": " );
                produccion [ren][col] = entrada.nextInt();  
              }
              entrada.nextLine();
          }
        //Imprimir salida
        System.out.println("REPORTE SEMESTRAL DE PRODUCCION");
        System.out.print("NOMBRE DEL OBRERO     MES 1    MES 2");
        System.out.println("MES 3    MES 4    MES 5    MES 6    TOTAL PRODUCCION");
        System.out.print("-----------------------------");
        System.out.println("-----------------------------");
        
        toTotProd = 0;
         for (ren = 0; ren <= 2; ren ++)
          {
              System.out.print(nombres [ren] +"   ");
              totProd = 0;
              for (col = 0; col <= 5; col ++)
              {
                System.out.print(produccion [ren][col] +"  ");
                totProd = totProd + produccion [ren][col]; 
              }
              System.out.println(totProd);
              toTotProd = toTotProd + totProd;
          }
         System.out.print("-----------------------------");
         System.out.println("-------------------------------");
         System.out.println(" Total                       "+ toTotProd);
    }
    
}