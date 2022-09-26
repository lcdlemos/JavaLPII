package lista1;

import java.util.Scanner;

public class Questao08Combustivel {
	
	public static void main(String[] args) {
		
		System.out.print("\n\t CONSUMO DE COMBUSTÍVEL\n");
		
		 Scanner sc = new Scanner(System.in);
		
		 boolean parada = false;
		 int km=0, litros=0, contador=1;
		 float consumo=0, consumoAcumulado=0;
		 
		 while (parada != true) {															//Enquanto houver informes, o programa continua rodando
		
			 System.out.printf("\n Deseja informar consumo de combustivel? (s/n)? ");
			 String resposta = sc.nextLine().toLowerCase();
			 
			 if (resposta.equals("s")) {
				 System.out.printf("\n - Caso %d\n", contador);
				 
				 System.out.print("\n Informe a quilometragem: ");
				 km = sc.nextInt();															//Coleta a quilometragem
				 				 
				 System.out.print(" Informe os litros de combustivel: ");
				 litros = sc.nextInt();													//Coleta a quantidade de litros
				 				 
				 consumo = km/(float)litros;												//Calcula consumo atual
				 
				 consumoAcumulado = (consumoAcumulado + consumo)/contador;					//Calcula o consumo medio, o atual com o acumulado
				 sc.nextLine();
				 
				 System.out.printf("\n Consumo atual : %.2fKm/l",  consumo);				//Exibe os resultados de consumo atual e medio
				 System.out.printf("\n Consumo medio: %.2fkm/l", consumoAcumulado);
				 
				 contador++;
				 
			 } else {
				 parada = true;																//Criterio de parada do programa
			 }
			 
			 System.out.printf("\n");
			 
			 
			 
		 }
		 
		 System.out.printf(" Fim do Programa!");
		 
		 sc.close();
	}

}
