package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 1; i <= 64; i++) {
			map.put(i, 0);
		}
		
		int i = 3, j = 3;
		for (int l = 0; l < 1000; l++) {
			
			Game game = new Game(i, j, 8);
			int moves = 0;
			boolean stop = false;
			
			for (int k = 0; k < 64; k++) {
				moves ++;
				if (!game.move()) {
					stop = true;
					break;
				}
			}
			
			if (stop) {
				printLost(moves, game);
				System.out.println("");
			} else {
				printWon(moves, game);
				System.out.println("");
			}
			
			map.put(moves, map.get(moves) + 1);
		}
		
		List<Integer> sortedList = new ArrayList<>(map.keySet());
		Collections.sort(sortedList);
		
		for (Integer k : sortedList) {
			System.out.println(String.format("Tentativas: %d - Passos: %d", map.get(k), k));
		}
	}
	
	private static void printLost(int moves, Game game) {
		String str = "O passeio finalizou com %d movimentos.\nNão houve um passeio completo! Sem solução!";
		System.out.println(String.format(str, moves));
		game.printBoard();
	}
	
	private static void printWon(int moves, Game game) {
		String str = "O passeio finalizou com %d movimentos.\nHouve um passeio completo! Parabéns!";
		System.out.println(String.format(str, moves));
		game.printBoard();
	}
}
