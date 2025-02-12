public class Matrices {
    public static void main(String[] args) {
        // Definimos un matriz
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        // Recorrer una matriz
        // 1. Ciclo más externo. Recorrer las filas
        for (var filas = 0; filas < matriz.length; filas++) {
            // 2. Ciclo más interno. Recorrer las columnas
            for (var columnas = 0; columnas < matriz[filas].length; columnas++){
                System.out.println("Valor[" + filas + "][" + columnas + "] = " + matriz[filas][columnas]);
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