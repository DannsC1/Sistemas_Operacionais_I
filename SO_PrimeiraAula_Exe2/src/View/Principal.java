package View;

import javax.swing.JOptionPane; 
import Controller.OperacoesController; 

public class Principal {

    public static void main(String[] args) {
        
        OperacoesController controller = new OperacoesController();
        
        String frase = JOptionPane.showInputDialog("Digite o texto separado por ponto e vírgula:");
        
        // Chama o método que processa a frase digitada
        controller.palavras(frase);
    }
}