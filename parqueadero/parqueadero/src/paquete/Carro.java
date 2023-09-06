package paquete;

public class Carro {

    private String placa;
    private String marca;
    private String modelo;

    public Carro(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "DATOS DEL CARRO: \n" + "PLACA: " + this.placa + "\n" + "MARCA: " + this.marca + "\n" + "MODELO: " + this.modelo;
    }

}
