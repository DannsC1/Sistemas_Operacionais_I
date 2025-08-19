package View;

import Controller.OperacoesController;

public class Principal {
	
	public static void main(String[] args) {
		
		int [] vetor1 = new int [1000];
		int [] vetor2 = new int [10000];
		int [] vetor3 = new int [100000];
		
		OperacoesController operacoesController = new OperacoesController();
		
		operacoesController.Cronometro(vetor1);
		operacoesController.Cronometro(vetor2);
		operacoesController.Cronometro(vetor3);
		
	}
}