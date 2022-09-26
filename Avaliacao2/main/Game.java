package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
	
	private Board board;
	private int r;
	private int c;
	private int size;
	private int count;
	
	public Game(int r, int c, int size) {
		this.size = size;
		this.board = new Board(size);
		this.count = 1;
		this.board.setValue(r, c, this.count);
		this.r = r;
		this.c = c;
	}
	
	public void printBoard() { 
		int[][] b = this.board.getBoard();
		System.out.println("    0   1   2   3   4   5   6   7\n");
		for (int i = 0; i < b.length; i++) {
			System.out.print(i + "   ");
			for (int j = 0; j < b[i].length; j++) {
				if (b[i][j] < 10) {
					System.out.print(b[i][j] + "   ");
				} else {
					System.out.print(b[i][j] + "  ");
				}
			}
			System.out.println("");
		}
	}
	
	public boolean move() {
		int[] newPosition = this.randomChoice();
		if (newPosition != null) {
			this.r = newPosition[0];
			this.c = newPosition[1];
			this.count ++;
			this.board.setValue(this.r, this.c, this.count);
			return true;
		} else {
			return false;
		}
	}
	
	private int[] randomChoice() {
		List<int[]> list = possibles(this.r, this.c);
		Random rand = new Random();
		return list.isEmpty() ? null : list.get(rand.nextInt(list.size()));
	}
	
	private List<int[]> possibles(int i, int j) {
		int[][] positions = new int[][] {{i - 1, j + 2}, {i - 1, j - 2},
										 {i + 1, j + 2}, {i + 1, j - 2},
										 {i - 2, j + 1}, {i - 2, j - 1},
										 {i + 2, j + 1}, {i + 2, j - 1}};
		
		List<int[]> list = new ArrayList<int[]>();
		for (int k = 0; k < positions.length; k++) {
			if (isValid(positions[k][0], positions[k][1])) {
				list.add(positions[k]);
			}
		}
		return list;
	}
	
	private boolean isValid(int i, int j) {
		return i >= 0 && j >= 0 && 
				i < this.size && j < this.size &&
					this.board.getBoard()[i][j] == 0;
	}
}
