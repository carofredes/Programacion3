public class TableroMagico {
    private int[][] tablero;
    private boolean[] disponibles;
    private int suma, limiteNum;

    public TableroMagico(int cantidad, int limite) {
        tablero = new int[cantidad][cantidad];
        disponibles = new boolean[limite];
        for (int i = 0; i < disponibles.length; i++) {
            disponibles[i] = true;
        }
        suma = cantidad * (cantidad * cantidad + 1) / 2;
        limiteNum = limite;
    }

    public void run() {
        solucionar(0, 0);
    }

    public void solucionar(int fila, int col) {
        for (int i = 1; i <= limiteNum; i++) {
            if (disponibles[i - 1]) {
                tablero[fila][col] = i;
                disponibles[i - 1] = false;
                if (!hayDisponibles() || tableroCompleto()) {
                    if (esSolucion()) {
                        System.out.println("Solucion");
                        imprimirSolucion();
                    }
                } else {
                    if (col != 2) {
                        solucionar(fila, col + 1);
                    } else if (fila != 2) {
                        solucionar(fila + 1, 0);
                    }
                }
                tablero[fila][col] = 0;
                disponibles[i - 1] = true;
            }
        }
    }

        public boolean hayDisponibles() {
            for (boolean valorActual : disponibles) {
                if (valorActual) {
                    return true;
                }
            }
            return false;
        }

        public boolean tableroCompleto() {
            for (int i=0; i < tablero.length; i++) {
                for (int j=0; j < tablero.length; j++) {
                    if (tablero[i][j] == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean esSolucion() {
            for (int i = 0; i < tablero.length; i++) {
                if (!columnaValida(i) || !filaValida(i) ) {
                    return false;
                }
            }
            return diagonalesValidas();
        }

        public boolean filaValida(int fila) {
            int sumaProv = 0;
            for (int i=0; i < tablero.length; i++) {
                sumaProv += tablero[fila][i];
            }
            return (sumaProv == suma);
        }

        public boolean columnaValida(int col) {
            int sumaProv = 0;
            for (int i=0; i < tablero.length; i++) {
                sumaProv += tablero[i][col];
            }
            return (sumaProv == suma);
        }

        public boolean diagonalesValidas() {
            int sumaDiag1 = 0, sumaDiag2 = 0;
            for (int i=0; i < tablero.length; i++) {
                sumaDiag1 += tablero[i][i];
                sumaDiag2 += tablero[i][tablero.length - i - 1];
            }
            return ((sumaDiag1 == suma) && (sumaDiag2 == suma));
        }
        
        public void imprimirSolucion() {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
