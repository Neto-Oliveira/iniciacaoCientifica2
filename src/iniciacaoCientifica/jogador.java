package iniciacaoCientifica;

abstract public class jogador {
	protected String nome;
	protected String nomeJogo;
	protected int id;
	protected int pontuacaoInicialBAI;
	protected int pontuacaoFinalBAI;
	
		
	public jogador(String nome, String nomeJogo, int id, int pontuacaoInicialBAI, int pontuacaoFinalBAI) {
		super();
		this.nome = nome;
		this.nomeJogo = nomeJogo;
		this.id = id;
		this.pontuacaoInicialBAI = pontuacaoInicialBAI;
		this.pontuacaoFinalBAI = pontuacaoFinalBAI;
	}
	abstract void calcularBAIInicial();
	abstract void calcularBAIFinal();
}
