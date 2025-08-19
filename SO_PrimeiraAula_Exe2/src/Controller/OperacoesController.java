package Controller;

public class OperacoesController {
    
    public OperacoesController() {
        super();
    }
    
    public void palavras(String frase) {
    	
        // Divide a frase em partes usando ponto e vírgula como separador
        String[] vetorPalavras = frase.split(";");
        
        // Exibe no console a quantidade de partes encontradas
        System.out.println("Quantidade de partes: " + vetorPalavras.length);
    }
}