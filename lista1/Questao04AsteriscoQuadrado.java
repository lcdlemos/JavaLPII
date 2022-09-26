package lista1;

import java.util.Scanner;

public class Questao04AsteriscoQuadrado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\n\t QUADRADO DE ASTERISCOS \n\n");
		System.out.printf("\n Informe o numero de lados do quadrado: ");
		
		int tamanho = sc.nextInt();								//Cria a variavel scanner a ser lida do teclado
		System.out.printf("\n");
		
		sc.close();
	
		for (int i = 0; i < tamanho; i++) {						//Inicia a linha do quadrado
			if (i == 0 || i == tamanho - 1) {					//Testa se esta na primeira ou ultima linha do quadrado
				System.out.printf(geraLado(tamanho));			//Chama a funcao para imprimir os asteriscos
			} else {
				for (int j = 0; j < tamanho; j++) {				//Varre cada coluna da linha do quadrado
					if (j == 0 || j == tamanho - 1) {
						System.out.printf("* ");				//Imprime as colunas de asteriscos
					} else {
						System.out.printf("  ");				//Imprime os espacos nos locais que não são os lados do quadrado
					}
				}
			}
			
			System.out.printf("\n");
		}
		
	}
	
	private static String geraLado(int tamanho) {
		String saida = "";
		for (int i = 0; i < tamanho; i++) {
			saida = saida + "* ";
		}
		return saida;
	}

}
