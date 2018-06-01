public class main {
    public static void main(String[] args) {
       /* Tablero mágico. Dado un tablero de tamaño n x n, construir un algoritmo que ubique (si es
        posible) n*n números naturales diferentes, entre 1 y un cierto k (con k>n*n), de manera tal
        que la suma de las columnas y de las filas sea igual a S.*/

       // Limite es el valor que representa k y Cantidad es n
       TableroMagico tm = new TableroMagico(3,9);
       tm.run();
    }
}
