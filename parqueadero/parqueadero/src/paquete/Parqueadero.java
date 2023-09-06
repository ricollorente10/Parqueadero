package paquete;

public class Parqueadero {

    Carro[][] parqueo = new Carro[5][5];
    double tarifa_hora = 700.00;

    public Parqueadero() {
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        Carro car = null;
        car = parqueo[fila][columna];
        if (car != null) {
            return false;
        } else {
            parqueo[fila][columna] = carro;
            return true;
        }
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        if (horas > 1) {
            return horas * this.tarifa_hora;
        } else {
            return this.tarifa_hora;
        }
    }

    public void mostrarEstadoParqueadero() {
        System.out.println("LOS ESPACIOS MARCADOS CON X ESTAN OCUPADOS.\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Carro car = parqueo[i][j];
                if (car != null) {
                    System.out.println("EL ESPACIO " + i + ":" + j + " -> X");
                } else {
                    System.out.println("EL ESPACIO " + i + ":" + j + " -> ");
                }
            }
        }
    }

}
