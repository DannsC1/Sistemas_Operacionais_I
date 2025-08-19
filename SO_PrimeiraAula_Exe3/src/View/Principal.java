package View;

import javax.swing.JOptionPane;
import Controller.OperacoesController;

public class Principal {
    public static void main(String[] args) {
        OperacoesController controller = new OperacoesController();

        // Solicita o tamanho do vetor
        String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho do vetor (máximo 100):");
        int tamanho = Integer.parseInt(inputTamanho);

        // Valida o tamanho
        if (tamanho <= 0 || tamanho > 100) {
            System.out.println("Tamanho inválido. Deve ser entre 1 e 100.");
            return;
        }

        // Cria o vetor e solicita os valores
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            String valor = JOptionPane.showInputDialog("Digite o valor da posição " + (i + 1) + ":");
            vetor[i] = Integer.parseInt(valor);
        }

        // Chama a operação de análise
        controller.analisarVetor(vetor);
    }
}