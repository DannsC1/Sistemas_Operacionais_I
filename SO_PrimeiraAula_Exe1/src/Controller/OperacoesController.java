package Controller;

public class OperacoesController {
	
	public OperacoesController () {
		super ();
	}
	
	public void Cronometro (int [] vetor) {
		
		double TempoInicial = System.nanoTime();
		
		for ( int i = 0; i < vetor.length; i++) {
			vetor[i] = 0;
			
		}
			
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
			
		TempoTotal = TempoTotal / Math.pow(10, 9);
	
		System.out.printf("Tamanho %d => %.8f s%n", vetor.length, TempoTotal);
	
	}
}