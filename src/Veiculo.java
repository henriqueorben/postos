

import javax.swing.*;

public class Veiculo {

    private String placa;
    private String modelo;
    private double combustivel;
    private double consumo;

    public Veiculo(String placa, String modelo, double consumo) {
        this.placa = placa;
        this.modelo = modelo;
        this.combustivel = 0;
        this.consumo = consumo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void abastecer(double litros) {
        combustivel = combustivel + litros;
        JOptionPane.showMessageDialog(null, "Abastecimento realizado com sucesso!");
    }

    public void viajar(double distancia) {
        double necessario = distancia / consumo;

        if (combustivel >= necessario) {
            combustivel = combustivel - necessario;
            JOptionPane.showMessageDialog(null, "Viagem realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Combustível insuficiente para a viagem.");
        }
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null,
                "Placa: " + placa +
                        "\nModelo: " + modelo +
                        "\nCombustível: " + combustivel + " litros" +
        "\nConsumo: " + consumo + "KM por litro");
    }
}

