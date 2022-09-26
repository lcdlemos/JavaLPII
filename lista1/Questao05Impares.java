package lista1;

import java.util.Scanner;

public class Questao05Impares {
	
	public static void main(String[] args) {
		
		System.out.printf("\n SOMA DE TODOS OS IMPARES NO INTERVALO DE A ATE B\n\n");
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.printf(" Informe o limite inferior a = ");
		int a = sc.nextInt();
		
		System.out.printf(" Informe o limite superior b = ");
		int b = sc.nextInt();
		
		sc.close();
		
		for(int i = a; i <= b; i++) {
			if(i%2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.printf("\n No intervalo de %d a %d, a soma dos numeros impares e igual a %d", a, b, soma);
	}

}
