package lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{
	
	public static void main(String[] args) {
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
		
		for(int i = 1; i <= 64; i++){
			mapa.put(i, 0);
		}
		
		int i = 3, j = 3;
		for(int l = 0; l < 1000; l++){
			Passeio passeio = new Passeio(i, j, 8);
			int anda = 0;
			boolean parada = false;
			
			for(int k = 0; k < 64; k++){
				anda ++;
				if(!passeio.anda()){
					parada = true;
					break;
				}
			}
			
			if(parada){
				exibeFalha(anda, passeio);
				System.out.println("");
			}else{
				exibeSucesso(anda, passeio);
				System.out.println("");
			}
			
			mapa.put(anda, mapa.get(anda) + 1);
		}
		
		List<Integer> listaOrdenada = new ArrayList<>(mapa.keySet());
		Collections.sort(listaOrdenada);
		
		for(Integer k : listaOrdenada){
			System.out.println(String.format("Tentativas: %d - Passos: %d", mapa.get(k), k));
		}
	}
	
	private static void exibeFalha(int anda, Passeio passeio) {
		String mensagem = "O passeio finalizou com %d movimentos.\nNão houve um passeio completo! Sem solução!";
		System.out.println(String.format(mensagem, anda));
		passeio.mostraTabuleiro();
	}
	
	private static void exibeSucesso(int anda, Passeio passeio) {
		String mensagem = "O passeio finalizou com %d movimentos.\nHouve um passeio completo! Parabéns!";
		System.out.println(String.format(mensagem, anda));
		passeio.mostraTabuleiro();
	}
}