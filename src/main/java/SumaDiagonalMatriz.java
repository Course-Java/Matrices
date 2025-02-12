import java.util.Scanner;

public class SumaDiagonalMatriz {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int filas, columnas;

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la cantidad de filas de la matriz: ");
        filas = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona la cantidad de columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[filas][columnas];

        // Solicitar los valores
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.print("Valor[" + i + "][" + j + "] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Iterar los valores de la matriz
        System.out.println();

        var sumaDiagonal = 0;

        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++){
                if (!(i == j))
                    continue;
                sumaDiagonal += matriz[i][j];
            }
        }

        System.out.println("Suma Diagonal = " + sumaDiagonal);
    }
}
