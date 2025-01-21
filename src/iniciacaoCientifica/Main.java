package iniciacaoCientifica;

//import java.util.Scanner;


//18/01/2025 passar para POO amanhã
public class Main {
	public static void main(String args[]) {
	
		cadastrarJogadores jogador1 = new cadastrarJogadores(null, null, 0, 0, 0);
		jogador1.cadastrar();
		jogador1.calcularBAIInicial();
		System.out.println("Nome:"+ jogador1.nome +""
				+ "\nJogo: " + jogador1.nomeJogo
				+ "\nId:" + jogador1.id
				+ "\nBai inicial:" +jogador1.pontuacaoInicialBAI
				+ "\nBai final:"+jogador1.pontuacaoFinalBAI);
	}
}
