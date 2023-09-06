package paquete;

public class run {

    public static void main(String[] args) {

        Carro carro_1 = new Carro("JKO980", "MERCEDEZ", "2020");
        Carro carro_2 = new Carro("II0009", "RENAULT", "2000");
        Carro carro_3 = new Carro("UUY782", "FORD", "2009");
        Carro carro_4 = new Carro("EER421", "MERCEDEZ", "2012");
        Carro carro_5 = new Carro("VBH243", "MAZDA", "2022");

        Parqueadero parqueadero = new Parqueadero();

        boolean parqueo_c1 = parqueadero.parquearCarro(carro_1, 2, 2);
        boolean parqueo_c2 = parqueadero.parquearCarro(carro_2, 2, 2);
        boolean parqueo_c3 = parqueadero.parquearCarro(carro_3, 4, 3);
        boolean parqueo_c4 = parqueadero.parquearCarro(carro_4, 1, 2);
        boolean parqueo_c5 = parqueadero.parquearCarro(carro_5, 4, 4);

        boolean[] parqueado = {parqueo_c1, parqueo_c2, parqueo_c3, parqueo_c4, parqueo_c5};

        parqueos(parqueado);

        System.out.println("\n----------------------------------------------------------------------------------------\n");

        System.out.println("EL CARRO 1 PAGA DE PARQUEADERO: " + parqueadero.cobrarPorTiempo(carro_1, 4));
        System.out.println("EL CARRO 2 PAGA DE PARQUEADERO: " + parqueadero.cobrarPorTiempo(carro_1, 1));

        System.out.println("\n----------------------------------------------------------------------------------------\n");

        parqueadero.mostrarEstadoParqueadero();

    }

    public static void parqueos(boolean[] parqueado) {
        for (int i = 0; i < parqueado.length; i++) {
            int pos = i + 1;
            if (parqueado[i]) {
                System.out.println("EL CARRO " + pos + " ESTA PARQUEADO.");
            } else {
                System.err.println("EL CARRO " + pos + " NO FUE POSIBLE PARQUEARLO YA QUE EL ESPACIO SE ENCUENTRA OCUPADO.");
            }
        }
    }

}
