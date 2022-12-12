/*Algorithm by MACE*/
package prototipoJogo2.main;

/*importação das outras classes presentes no projeto*/

import prototipoJogo2.mapa.Map;
import prototipoJogo2.movimento.Movimentar;
import prototipoJogo2.validacao.Validar;
import prototipoJogo2.warrior.SwordWarrior;
import prototipoJogo2.warrior.Warrior;

/*Classe que irá controlar os movimentos e as interações do jogo*/
public class Controller {

	Map map;
	Warrior warrior;
	Movimentar move;
	Validar validate;
	
	/*Construtor da classe Controller*/ 
	public Controller(Map m, Warrior w) {
		
		this.map = m;
		this.warrior = w;
		this.move = new Movimentar();
		this.validate = new Validar();
	}
	
	/*Método que irá controlar os movimentos básicos do jogo. De andar, voltar, subir e descer
	 * temos nessa classe a utilização do padrão Strategy*/
	public boolean runningGame (char direction) {
		
		boolean gameOver = false;
		
		switch(direction) {
		
			case 'D':
				
				validate.setStrategyToValidarAndar();
				move.setStrategyToAndar();
				break;
			
			case 'A':
				
				validate.setStrategyToValidarVoltar();
				move.setStrategyToVoltar();
				break;
			
			case 'W':
				
				validate.setStrategyToValidarPular();
				move.setStrategyToPular();
				break;
			
			case 'S':
				
				validate.setStrategyToValidarDescer();
				move.setStrategyToDescer();
				break;
			
			default:
				
				System.out.println("ERRO: Direção inválida");
				break;
		}
		
		/*Verificação da posição anterior do personagem e da posição futura do personagem após o movimento realizado.
		 * Nessa verificação é realizada a troca de posição do personagem.*/
		if(validate.executeStrategy(map, warrior)) {
			
			map.desocupar(warrior);
			move.executeStrategy(warrior);
			
			/*Verificação em relação ao retorno do método getSword(), onde verificamos se a posição ocupada
			 * pelo personagem após a realização do movimento possui a espada.*/
			if(getSword()) {
				/*Caso tenha a espada temos a utilização do padrão Decorator, para criarmos o personagem com espada.*/
				warrior = new SwordWarrior(warrior);
			}
		}
		
		else {
			System.out.println("ERRO: Movimento inválido");
		}
		
		/*Ao final de cada interação temos a variável gameOver recebendo o retorno do método gameOver que irá definir de 
		 * acordo com o retorno, se o jogo acabou ou não.*/
		gameOver = gameOver();
		
		/*Mostra a configuração do mapa ao final de cada interação.*/
		map.showMap(warrior);
		
		/*retorna a condição do jogo. Se acabou ou não.*/
		return gameOver;
	}
	
	/*Método para verificar se a posição do personagem após o movimento possui uma espada.*/
	private boolean getSword() {
		
		if(warrior.getPlayerPositionY() == map.getSwordPositionY() && warrior.getPlayerPositionX() == map.getSwordPositionX()) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/*Método responsável por verificar se o jogo acabou ou não.*/
	private boolean gameOver() {
		
		if(warrior.getPlayerPositionY() == map.getBoss().getBossPositionY() && warrior.getPlayerPositionX() == map.getBoss().getBossPositionX()) {
			
			if(warrior.getStatus().equals("   -0->   ")) {
				
				map.getBoss().setDead(true);
				
				System.out.println("VOCÊ VENCEU");
				System.out.println("PARABÉNS!!!!");
			}
			
			else if (warrior.getStatus().equals("   -0-    ")){
				
				System.out.println("VOCÊ MORREU");
			}
			
			return true;
		}
		
		else {
			return false;
		}
	}
}