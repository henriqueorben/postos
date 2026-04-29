import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Veiculo[] veiculos = new Veiculo[3];

        for (int i = 0; i < veiculos.length; i++) {
            veiculos[i] = new Veiculo();

            veiculos[i].placa = JOptionPane.showInputDialog("Digite a placa do veículo " + i + ":");
            veiculos[i].modelo = JOptionPane.showInputDialog("Digite o modelo do veículo " + i + ":");
            veiculos[i].combustivel = 0;
        }

        int opcao = -1;

        while (opcao != 0) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "0 - Sair\n" +
                            "1 - Abastecer veículo\n" +
                            "2 - Viajar\n" +
                            "3 - Exibir dados do veículo"
            ));

            if (opcao == 1) {
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));

                if (posicao >= 0 && posicao < veiculos.length) {
                    double litros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros:"));
                    veiculos[posicao].abastecer(litros);
                } else {
                    JOptionPane.showMessageDialog(null, "Posição inválida.");
                }
            }

            if (opcao == 2) {
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));

                if (posicao >= 0 && posicao < veiculos.length) {
                    double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância da viagem em km:"));
                    veiculos[posicao].viajar(distancia);
                } else {
                    JOptionPane.showMessageDialog(null, "Posição inválida.");
                }
            }

            if (opcao == 3) {
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));

                if (posicao >= 0 && posicao < veiculos.length) {
                    veiculos[posicao].exibirDados();
                } else {
                    JOptionPane.showMessageDialog(null, "Posição inválida.");
                }
            }
        }
    }
}