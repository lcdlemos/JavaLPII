package main;

public class Board {
	
	private int[][] board;
	
	public Board(int size) {
		this.board = new int[size][size];
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public void setValue(int i, int j, int value) {
		this.board[i][j] = value;
	}
}
