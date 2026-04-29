

    import javax.swing.*;

    public class Veiculo {

       private String placa;

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

       private String modelo;

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

       private double combustivel;

        public double getCombustivel() {
            return combustivel;
        }



       public void abastecer(double litros) {
            combustivel = combustivel + litros;
            JOptionPane.showMessageDialog(null, "Abastecimento realizado com sucesso!");
        }

       public void viajar(double distancia) {
            double necessario = distancia / 10.0;

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
                            "\nCombustível: " + combustivel + " litros");
        }
    }
