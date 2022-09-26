package lista1;

import java.util.Scanner;

public class Questao06Volumes {
	
	public static void main(String[] args) {
		
		System.out.printf("\n CALCULO DO VOLUME DE UM SOLIDO\n");
		
		Scanner sc = new Scanner(System.in);
		
		boolean sair = false;
		
		while(sair != true) {
			System.out.printf("\n\n ======= Opcoes =======\n\n");
			System.out.printf(" 1. Volume do Cilindro\n");
			System.out.printf(" 2. Volume do Cone\n");
			System.out.printf(" 3. Volume do Prisma\n");
			System.out.printf(" 4. Volume da Esfera\n");
			System.out.printf(" 5. Fim do Programa\n");
			System.out.printf("\n Opcao: ");
			
			int opcao = sc.nextInt();
			System.out.printf("\n");
			
			switch (opcao) {
				case 1:
					calculaCilindro(sc);
					break;
				case 2:
					calculaCone(sc);
					break;
				case 3:
					calculaPrima(sc);
					break;
				case 4:
					calculaEsfera(sc);
					break;
				case 5:
					sair = true;
					break;
			}
			
		}
		System.out.printf("Fim do Programa!");
	}
	
	
	private static void calculaCilindro(Scanner sc) {											//Chamada da funcao que calcula volume do cone
		System.out.printf(" - Volume do Cilindro\n");
		
		System.out.printf(" Informe o raio da base do cilindro: ");
		float raio = sc.nextFloat();
		
		System.out.printf(" Informe a altura do cilindro: ");
		float altura = sc.nextFloat();
		
		System.out.printf(String.format(" Volume do cilindro: %.2f\n", Math.PI * raio * raio * altura));
	}
	
	
	private static void calculaCone(Scanner sc) {												//Chamada da funcao que calcula volume do cone
		System.out.printf(" - Volume do Cone\n");

		System.out.printf(" Informe o raio da base do cone: ");									//Necessario para calcular a area da base do cone
		float raio = sc.nextFloat();
		
		System.out.printf(" Informe a altura do cone: ");											//Altura pela area da base dividida por 3 retornara o volume do cone
		float altura = sc.nextFloat();
		
		System.out.printf(" Volume do Cone: %.2f\n", (Math.PI * raio * raio * altura)/3);
	}
	
	
	private static void calculaPrima(Scanner sc) {												//Chamada da funcao que calcula volume do prisma
		System.out.println(" - Volume do Prisma de Base Retangular\n");

		float volume = 1;
		
		for (int lado = 1; lado < 4; lado++) {													//Realiza 3 iteracoes para calculo do volume de um prisma de base retangular (comprimento x altura x largura)
			System.out.printf(" Lado %d: ", lado);
			float valorLado = sc.nextFloat();
			volume = volume * valorLado;														//A cada iteracao e multiplicado o valor informado
		}
		
		System.out.printf(" Volume do Prisma: %.2f\n", volume);
	}
	
	
	private static void calculaEsfera(Scanner sc) {												//Chamada da funcao que calcula volume da esfera
		System.out.printf(" - Volume da Esfera\n");
		
		System.out.printf(" Informe o raio da esfera: ");
		float raio = sc.nextFloat();
	
		System.out.printf(" Volume da Esfera: %.2f\n", (4 * Math.PI * raio * raio * raio)/3);	//Calculo do volume e feito na chamada da variavel
	}

}
