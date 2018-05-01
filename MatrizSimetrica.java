/*
 * Este programa en java, pide una matriz al usuario, luego se verifica si es o no simetrica, imprimiendo el resultado por pantalla
 */
 package MatrizSimetrica;
 import java.util.Scanner;
 /**
 * @Autor Yesica Martin
 */
 public class MatrizSimetrica {
        public static void main(String[] args) {

            int FilasMatriz;
            int ColumnasMatriz;

            Scanner Usuario = new Scanner (System.in);
            System.out.print("Ingrese el numero de Filas de la Matriz (Enteros Positivos) = ");
            FilasMatriz= Usuario.nextInt();

            System.out.print("Ingrese el numero de Columnas de la Matriz (Enteros Positivos) = ");
            ColumnasMatriz= Usuario.nextInt();

            System.out.println(" ");//Impresion de un espacio para mantener orden

            int matriz [][]= new int[FilasMatriz][ColumnasMatriz];

            for(int fila=0;fila<matriz.length;fila++)
                { 
                for(int columna=0;columna<ColumnasMatriz;columna++)
                    {
                        System.out.print("Ingrese el valor de la posicion ["+fila+"]["+columna+"] = ");
                        matriz[fila][columna]= Usuario.nextInt();
                    }
                }
                System.out.println(" "); //Impresion de un espacio para mantener orden

                boolean simetrica = true;
                for(int i = 0; simetrica; i++)
                    {
                    for(int j = 0; j < matriz.length; j++)
                        {
                            if(matriz[i][j] == matriz[j][i])
                                {
                                    if(i == matriz.length-1 && j == matriz.length-1)
                                        {
                                             System.out.println("La matriz es simetrica");
                                             simetrica = false;
                                        }
                                }
                                 else
                                    {
                                         System.out.println("No es simetrica porque los valor de ["+i+"]"+"["+j+"]= "+matriz[i][j]+" y "+"["+j+"]"+"["+i+"]= "+matriz[j][i]);
                                         simetrica = false;
                                    }
                        }
                    }

        }
}
