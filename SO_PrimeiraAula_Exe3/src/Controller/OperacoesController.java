package Controller;

public class OperacoesController {

    public OperacoesController() {
        super();
    }

    public void analisarVetor(int[] vetor) {
        System.out.println("Análise do vetor:");

        for (int numero : vetor) {
            if (numero % 2 != 0) {
            	
                // Número ímpar
                System.out.println(numero + " é ímpar");
            } else if (numero % 10 == 0) {
            	
                // Número par e múltiplo de 10
                System.out.println(numero + " é par e múltiplo de 10");
            }
        }
    }
}