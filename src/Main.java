import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Veiculo[] veiculos = new Veiculo[3];

        for (int i = 0; i < veiculos.length; i++) {
            String placa = JOptionPane.showInputDialog("Digite a placa do veículo " + i + ":");
            String modelo = JOptionPane.showInputDialog("Digite o modelo do veículo " + i + ":");
            double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo do veículo"));
            veiculos[i] = new Veiculo(placa, modelo, consumo);
        }

        int opcao = -1;

        while (opcao != 0) {

            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(
                        "0 - Sair\n" +
                                "1 - Abastecer veículo\n" +
                                "2 - Viajar\n" +
                                "3 - Exibir dados do veículo"
                ));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números!");
                opcao = -1;
                continue;
            }

            if (opcao == 1) {
                try {
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));
                    if (posicao >= 0 && posicao < veiculos.length) {
                        double litros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros:"));
                        veiculos[posicao].abastecer(litros);
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite apenas números!");
                }

            } else if (opcao == 2) {
                try {
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));
                    if (posicao >= 0 && posicao < veiculos.length) {
                        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância da viagem em km:"));
                        veiculos[posicao].viajar(distancia);
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite apenas números!");
                }

            } else if (opcao == 3) {
                try {
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do veículo (0, 1 ou 2):"));
                    if (posicao >= 0 && posicao < veiculos.length) {
                        veiculos[posicao].exibirDados();
                    } else {
                        JOptionPane.showMessageDialog(null, "Posição inválida.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite apenas números!");
                }

            } else if (opcao != 0) {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}