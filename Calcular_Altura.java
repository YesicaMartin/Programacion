/**
 * Calcular altura de cierta cantidad de personas tomadas por teclado
 */
package calcular_altura;
import java.util.Scanner;
/**
 * @author Yesica Martin
 */
public class Calcular_Altura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        System.out.print("-------------------------------------------\n");
        System.out.print("Digite candidad de personas: ");
        int numeroPersonas = 0; 
        numeroPersonas = entrada.nextInt();
        //Condicional
        if (numeroPersonas > 0) {
            int vector[] = new int[numeroPersonas];

            int sumaAlturas = 0;
            //Ingreso de altura
            for (int i = 0; i < numeroPersonas; i++) {
                System.out.print("-------------------------------------------\n");
                System.out.println("Digite altura de la persona " + (i + 1)+":");
                vector[i] = entrada.nextInt();
                sumaAlturas = sumaAlturas + vector[i];
            }
            //Calculo de la media general
            double mediaGeneral = 0;
            mediaGeneral = (sumaAlturas / numeroPersonas);
            //Calculo interno, mostrando cantidad de personas por encima y por debajo de la media general
            int alturaS = 0, alturaI = 0;
            for (int i = 0; i < numeroPersonas; i++) {
                if (mediaGeneral > vector[i]) {
                    alturaI = (alturaI + 1);
                } else {
                    alturaS = (alturaS + 1);
                }
            }
            //Impresion de datos
            System.out.println("-----------------------------------------------------------------------");
            System.out.print("La media es: " + mediaGeneral);
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.print("Cantidad de personas con altura superior a la media: " + alturaS);
            System.out.println("\n-----------------------------------------------------------------------");
            System.out.print("Cantidad de personas con altura inferior a la media: " + alturaI);
            System.out.println("\n-----------------------------------------------------------------------\n");
        } else {
            System.out.print("Porfavor digiete un valor mayor o igual a uno.");
        }
    }

}
