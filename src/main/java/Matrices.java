public class Matrices {
    public static void main(String[] args) {
        // Definimos un matriz
        final var FILAS = 2;
        final var COLUMNAS = 3;

        var matriz = new int[FILAS][COLUMNAS];

        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Recorrer una matriz
        // 1. Ciclo más externo. Recorrer las filas
        for (var filas = 0; filas < FILAS; filas++) {
            // 2. Ciclo más interno. Recorrer las columnas
            for (var columnas = 0; columnas < COLUMNAS; columnas++){
                System.out.println("Valor[" + filas + "][" + columnas + "] = " + matriz[filas][columnas]);
            }
        }
    }
}
