package lista1;

public class Questao03Facebook {
	
public static void main(String[] args) {
	
		System.out.printf("\n\t\t\t\t ESTIMATIVA DE USUARIOS DO FACEBOOK \n");
		
		long base = 1000000000, meta = 1500000000, usuarios;
		int meses = 0;											//Numero de meses como contador
		
		usuarios = base;
		
		while (usuarios < meta) {
			usuarios = (long)(usuarios * 1.04);					//Aumento de 4% no numero de usuarios por mes
			meses++;
		}
		
		System.out.printf("\n A partir da base de %d bilhão de usuarios, para alcancar a meta de %.1f bilhões de usuarios, o Facebook levara %d meses ", base/1000000000, (float)meta/1000000000, meses);
		
		usuarios = base;								//Redefinindo a base de usuarios para 1 bilhao
		meta = 2000000000;								//Redefinindo a meta para 2 bilhoes de usuarios
		meses = 0;
		while (usuarios < meta) {
			usuarios = (long)(usuarios * 1.04);
			meses++;
		}
		
		System.out.printf("\n A partir da base de %d bilhão de usuarios, para alcancar a meta de %.0f bilhões de usuarios, o Facebook levara %d meses ", base/1000000000, (float)meta/1000000000, meses);
		
		usuarios = base;								//Redefinindo a base de usuarios para 1 bilhao
		meses = 0;
				
		while(meses < 5) {			//Como estamos em agosto, até dezembro de 2021 serão 5 meses
			usuarios = (long)(usuarios * 1.04);
			meses++;
		}
		
		meta = usuarios;									//Com o tempo definido, o resultado do crescimento sera a propria meta
		
		System.out.printf("\n Em dezembro de 2021, a estimativa de usuarios do Facebook sera de %.1f bilhoes de usuarios", (float)meta/1000000000);
	}

}
