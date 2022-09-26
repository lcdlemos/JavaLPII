package lista1;

public class Questao16Matriz {
	
	public static void main(String[] args) {
		
		int matriz[] = {10, 0, 33, 0, 45, 0, 17, 5, 0, 13, 0, 12, 0, 23, 57, 0};		//A ordem da matriz implica no tamanho do vetor matriz (ordem*ordem)
		int conta = 0, m = 0, ordem = 4;												//Sempre que mexer na ordem, alterar o tamanho da matriz
				
		System.out.printf("\n ZEROS NUMA MATRIZ DE ORDEM %d", ordem);
		
		System.out.printf("\n\n");
		
		for(int i = 0; i < ordem; i++) {												//Varre a matriz pela linha
			for(int j = 0; j < ordem; j++) {											//Varre a matriz pela coluna
				System.out.printf(" %d", matriz[m]);
				if(matriz[m] == 0) {
					conta = conta + 1;
				}
				m++;																	//Incrementa a posicao do elemento do vetor para imprimir a matriz
			}
		
			System.out.printf(" \n");
		}
		
		System.out.printf("\n Esta matriz apresenta %d zeros", conta);
		
	}

}
