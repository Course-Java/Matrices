import java.util.Scanner;

public class Matrices {
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
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++){
                System.out.println("Valor[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}

/*
 * NOTAS:
 * Al usar una sintaxis simplificada para crear la matriz no tenemos una forma fácil de determinar las dimensiones de esta para poder recorrerla, tenemos que hacer estos pasos:
 * Para recorrer las filas de una matriz, cómo sabemos que una matriz es una arreglo de arreglos, con solo saber la cantidad de arreglos que se pueden almacenar, podemos determinar la cantidad de filas que tiene. Por eso consultamos matriz.length (la cantidad de espacios que tiene este arreglo de arreglos)
 * Para recorrer las columnas de una matriz, debemos de saber la cantidad de espacio que tiene el arreglo en el que estamos actualmente. Por eso consultamos matriz[fila].length
 * ¿Es confuso, verdad? ...
 */