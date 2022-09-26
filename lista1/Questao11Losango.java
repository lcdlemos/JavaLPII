package lista1;

public class Questao11Losango {
	
	public static void main(String[] args) {
		
		System.out.printf("\n LOSANGO DE ASTERISCOS\n\n");
		
		int tamanho = 7;										//Altera o tamanho do losango
		
		for (int i = 1; i <= tamanho; i++) {					//Imprime a parte de cima do losango
			System.out.printf(geraLinha(i, tamanho));			//Chama a funcao que imprime os asteriscos
			System.out.printf("\n");
		}
		
		for (int i = tamanho - 1; i >= 1; i--) {				//Imprime a parte de baixo do losango
			System.out.printf(geraLinha(i, tamanho));			//Chama a funcao que imprime os asteriscos
			System.out.printf("\n");
		}
	}
	
	private static String geraLinha(int i, int tamanho) {
		return geraEspaco(tamanho - i) + geraAsterisco(2 * i - 1) + geraEspaco(tamanho - i);	//Imprime os espacos, os asteriscos e depois os espacos
	}
	
	private static String geraEspaco(int tamanho) {						//Imprime os espacos antes e apos a impressao dos asteriscos em funcao do tamanho
		String saida = " ";
		for (int i = 0; i < tamanho; i++) {
			saida = saida + " ";
		}
		return saida;
	}
	
	private static String geraAsterisco(int tamanho) {					//Imprime o asterisco na posicao pos e antes dos espacos em funcao do tamanho
		String saida = " ";
		for (int i = 0; i < tamanho; i++) {
			saida = saida + "*";
		}
		return saida;
	}

}
