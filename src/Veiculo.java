

    import javax.swing.*;

    public class Veiculo {

        String placa;
        String modelo;
        double combustivel;

        void abastecer(double litros) {
            combustivel = combustivel + litros;
            JOptionPane.showMessageDialog(null, "Abastecimento realizado com sucesso!");
        }

        void viajar(double distancia) {
            double necessario = distancia / 10.0;

            if (combustivel >= necessario) {
                combustivel = combustivel - necessario;
                JOptionPane.showMessageDialog(null, "Viagem realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Combustível insuficiente para a viagem.");
            }
        }

        void exibirDados() {
            JOptionPane.showMessageDialog(null,
                    "Placa: " + placa +
                            "\nModelo: " + modelo +
                            "\nCombustível: " + combustivel + " litros");
        }
    }
