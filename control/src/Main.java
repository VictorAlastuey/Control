import java.util.Random;
import java.util.Scanner;

public class Main {


    static int[][] arrayAlea = new int[10][10];
    static String[][] arrayX = new String[10][10];
    static int Max_ColumnaAle = 10;
    static int Max_FilaAle = 10;
    static char Max_ColumnaX = 10;
    static char Max_FilaX = 10;
    static int intentos = 10;

    static Random aleatorio = new Random();
    static Scanner numscaner = new Scanner(System.in);

    private static void ArrayAleatorio() {
        for (int i = 0; i < Max_ColumnaAle; i++) {
            for (int j = 0; j < Max_FilaAle; j++) {
                arrayAlea[i][j] = aleatorio.nextInt(100);


            }

        }

    }

    private static void ArrayX() {
        for (int i = 0; i < Max_ColumnaX; i++) {
            for (int j = 0; j < Max_FilaX; j++) {
                arrayX[i][j] = String.valueOf('X');

            }

        }
    }

    private static void ArrayImprimirX() {
        for (int i = 0; i < Max_ColumnaX; i++) {
            for (int j = 0; j < Max_FilaAle; j++) {
                System.out.print(arrayX[i][j] + " ");
            }
            System.out.println("");
        }
    }


    private static void comparaNumeros() {
        boolean igual;

            int numeroUsario = numscaner.nextInt();

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (arrayAlea[i][j] == numeroUsario) {
                        arrayX[i][j] = String.valueOf(numeroUsario);

                    }

                }
            }
        }



        public static void main (String[]args){

            ArrayAleatorio();
            ArrayX();
            ArrayImprimirX();
            for (int i = 0; i < intentos; i++) {
                comparaNumeros();
                ArrayImprimirX();

            }




        }
    }




















