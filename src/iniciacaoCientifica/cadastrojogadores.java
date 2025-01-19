package iniciacaoCientifica;

import java.util.Scanner;

public class cadastrojogadores {
		
	
	
	
	
	
	
	void cadastrarjogador() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite seu Nome: ");
			String nome = scan.nextLine();
			int quantidadeRiso = scan.nextInt();
			scan.nextLine();
			System.out.println("Quantidade de risos: "+quantidadeRiso);
			scan.close();
		}
}
