/*Algorithm by MACE*/
package prototipoJogo2.main;

import java.util.Scanner;
import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.SimpleWarrior;
import prototipoJogo2.warrior.Warrior;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Warrior w = new SimpleWarrior();
		
		/*Jogador possui a opção de escolher a dificuldade com base no tamanho do mapa*/
		System.out.println("Selecione a dificulade: \n1) FÁCIL\n2) NORMAL\n3) DIFÍCIL");
		
		int choice = read.nextInt();
		int linhas = 0;
		int colunas = 0;
		
		/*Switch Case para escolher o tamanho*/
		switch (choice) {
			case (1):
				linhas = 2;
				colunas = 3;
			break;
			case (2):
				linhas = 3;
				colunas = 3;
			break;
			case (3):
				linhas = 4;
				colunas = 5;
			break;
				
		default:
			System.out.println("Opção inválida");
		}
		
		Map m = new Map(linhas, colunas);
		Controller c = new Controller(m, w);
		char direction;
		boolean loop = false;
		
		m.showMap(w);
		System.out.println("");
		
		/*Laço que irá executar, pedindo a direção do movimento enquanto a variável booleana
		 * loop for false, ou seja, enquanto o jogo não estiver acabado*/
		while(!loop) {
			
			System.out.println("Informe a direção: ");
			
			direction = read.next().charAt(0); //Lê um caractere.
			
			System.out.println("==============================");
			
			loop = c.runningGame(direction);
		}
		
		read.close();
	}
}