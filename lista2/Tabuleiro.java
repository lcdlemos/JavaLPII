package lista2;

public class Tabuleiro{
	private int[][] tabuleiro;
		
	public Tabuleiro(int tamanho){
		this.tabuleiro = new int[tamanho][tamanho];
	}

	public int[][] getTabuleiro(){
		return tabuleiro;
	}

	public void setTabuleiro(int[][] tabuleiro){
		this.tabuleiro = tabuleiro;
	}
		
	public void setValor(int i, int j, int valor){
		this.tabuleiro[i][j] = valor;
	}
}