package iniciacaoCientifica;
//finalizar a parte de cadastro de jogadores.
import java.util.Scanner;
public class cadastrarJogadores extends jogador {
	
	public cadastrarJogadores(String nome, String nomeJogo, int id, int pontuacaoInicialBAI, int pontuacaoFinalBAI) {
		super(nome, nomeJogo, id, pontuacaoInicialBAI, pontuacaoFinalBAI);
		// TODO Auto-generated constructor stub
	}
	public void cadastrar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do participante: ");
		this.nome = scan.nextLine();
		
		
		
		this.nomeJogo = null;
		while(nomeJogo == null) {
			System.out.println("Escolha o jogo: ");
			System.out.println("_______________________________________"); //ver depois uma biblioteca que centraliza bonitinho
			System.out.println("|1 - Dark Souls | 2 - Dead by Daylight |");
			System.out.println("|3 - FIFA | 4 - Genshin Impact |");
			System.out.println("|5 - League of Legends | 6- Mobile Legends |");
			System.out.println("|7 - Mortal Kombat | 8 - Stardew valley |");
			System.out.println("|9 - Valorant |  |");
			System.out.println("_______________________________________");
				int opjogo = scan.nextInt();
				switch(opjogo) {
				case 1:
					System.out.println("Jogo escolhido: Dark Souls");
					this.nomeJogo = "Dark Souls";
					break;
				case 2:
					System.out.println("Jogo escolhido: Dead by Daylight");
					this.nomeJogo = "Dead by Daylight";
					break;
				case 3:
					System.out.println("Jogo escolhido: FIFA");
					this.nomeJogo = "FIFA";
					break;
				case 4:
					System.out.println("Jogo escolhido: Genshin Impact");
					this.nomeJogo ="Genshin Impact";
					break;
				case 5:
					System.out.println("Jogo escolhido: League of Legends");
					this.nomeJogo ="League of Legends";
					break;
				case 6:
					System.out.println("Jogo escolhido: Mobile Legends");
					this.nomeJogo ="Mobile Legends";
					break;
				case 7:
					System.out.println("Jogo escolhido: Mortal Kombat");
					this.nomeJogo ="Mortal Kombat";
					break;
				case 8:
					System.out.println("Jogo escolhido: Stardew valley");
					this.nomeJogo ="Stardew valley";
					break;
				case 9:
					System.out.println("Jogo escolhido: Valorant");
					this.nomeJogo ="Valorant";
					break;
		    	default:
		    		System.out.println("\nJogo inválido! Tente novamente.\n");
				}
			
		}
		
		
		System.out.println("digite seu ID"); //quero auto incrementar esse ID depois
		this.id = scan.nextInt();
		scan.nextLine();
		System.out.println("Pontuação inicial do teste de BAI");
		this.pontuacaoInicialBAI = scan.nextInt();
		scan.nextLine();
		System.out.println("Pontuação final do teste de BAI");
		this.pontuacaoFinalBAI = scan.nextInt();
		scan.nextLine();
		scan.close(); //testando para o commit novos
		/*
		 * 
		 * 			Scanner scan = new Scanner(System.in);
			System.out.println("Digite seu Nome: ");
			String nome = scan.nextLine();
			int quantidadeRiso = scan.nextInt();
			scan.nextLine();
			System.out.println("Quantidade de risos: "+quantidadeRiso);
			scan.close();*/
	}
	@Override
	void calcularBAIInicial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calcularBAIFinal() {
		// TODO Auto-generated method stub
		
	}
	
}
