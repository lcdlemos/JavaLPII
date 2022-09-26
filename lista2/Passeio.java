package lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Passeio{
	
	private Tabuleiro tabuleiro;
	private int r;
	private int c;
	private int tamanho;
	private int conta;
	
	public Passeio(int r, int c, int tamanho){
		this.tamanho = tamanho;
		this.tabuleiro = new Tabuleiro(tamanho);
		this.conta = 1;
		this.tabuleiro.setValor(r, c, this.conta);
		this.r = r;
		this.c = c;
	}
	
	public void mostraTabuleiro(){
		int[][] b = this.tabuleiro.getTabuleiro();
		System.out.println("    0   1   2   3   4   5   6   7\n");
		for(int i = 0; i < b.length; i++){
			System.out.print(i + "   ");
			for(int j = 0; j < b[i].length; j++){
				if(b[i][j] < 10){
					System.out.print(b[i][j] + "   ");
				}else{
					System.out.print(b[i][j] + "  ");
				}
			}
			System.out.println("");
		}
	}
	
	public boolean anda(){
		int[] novaPosicao = this.escolhaAleatoria();
		if(novaPosicao != null){
			this.r = novaPosicao[0];
			this.c = novaPosicao[1];
			this.conta ++;
			this.tabuleiro.setValor(this.r, this.c, this.conta);
			return true;
		}else{
			return false;
		}
	}
	
	private int[] escolhaAleatoria(){
		List<int[]> lista = possibilidades(this.r, this.c);
		Random aleatorio = new Random();
		return lista.isEmpty() ? null : lista.get(aleatorio.nextInt(lista.size()));
	}
	
	private List<int[]> possibilidades(int i, int j){
		int[][] posicoes = new int[][] {{i - 1, j + 2}, {i - 1, j - 2}, {i + 1, j + 2}, {i + 1, j - 2}, {i - 2, j + 1}, {i - 2, j - 1}, {i + 2, j + 1}, {i + 2, j - 1}};
		
		List<int[]> lista = new ArrayList<int[]>();
		for (int k = 0; k < posicoes.length; k++) {
			if (eValido(posicoes[k][0], posicoes[k][1])){
				lista.add(posicoes[k]);
			}
		}
		return lista;
	}
	
	private boolean eValido(int i, int j){
		return i >= 0 && j >= 0 && i < this.tamanho && j < this.tamanho && this.tabuleiro.getTabuleiro()[i][j] == 0;
	}
}