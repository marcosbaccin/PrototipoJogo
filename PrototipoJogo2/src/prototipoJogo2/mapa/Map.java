/*Algorithm by MACE*/
package prototipoJogo2.mapa;

import java.util.Random;

import prototipoJogo2.warrior.Warrior;

/*Classe que irá ditar as configurações do mapa do jogo.*/
public class Map {
	
	/*Todos os atributos necessários para a construção do nosso mapa.*/
	private String [][] map;
	private int colunas;
	private int linhas;
	private Boss boss;
	private int swordPositionX;
	private int swordPositionY;
	
	/*Construtor do mapa.*/
	public Map(int linhas, int colunas) {
		
		this.map = new String[colunas][linhas];
		this.colunas = colunas;
		this.linhas = linhas;
		this.boss = new Boss(colunas-1, linhas-1);
		
		this.inicializarMapa();
	}
	
	/*Retorna a quantidade de linhas do mapa.*/
	public int getLinhas() {
		return linhas;
	}
	
	/*Retorna a quantidade de colunas do mapa.*/
	public int getColunas() {
		return colunas;
	}
	
	/*Retorna a posição referente ao eixo X de onde está a espada no mapa.*/
	public int getSwordPositionX() {
		return swordPositionX;
	}
	
	/*Retorna a posição referente ao eixo Y de onde está a espada no mapa.*/
	public int getSwordPositionY() {
		return swordPositionY;
	}
	
	/*Retorna a coordenada de onde está o Boss no mapa.*/
	public Boss getBoss() {
		return boss;
	}
	
	/*Método que irá "construir" realmente o mapa.*/
	private void inicializarMapa() {
		
		//Preenche todas as posições do mapa com 'vazio'.
		for(int i = 0; i < colunas; i++) {
			
			for(int j = 0; j < linhas; j++) {
				map[i][j] = "          ";
			}
		}
		
		//Coloca o BOSS na última posição do mapa.
		map[colunas-1][linhas-1] = "    @     ";
		
		gerarEspada();
	}
	
	//Coloca a espada em uma posição aleatória do mapa.
	private void gerarEspada() {
		
		Random r = new Random();
		
		do {
			
			swordPositionY = r.nextInt(colunas);
			swordPositionX = r.nextInt(linhas);
		} //Verifica se a posição da espada já está ocupada pelo WARRIOR ou pelo BOSS.
		while((swordPositionY == 0 && swordPositionX == 0) || (swordPositionY == (colunas-1) && swordPositionX == (linhas-1)));
		
		//Coloca a espada no mapa
		map[swordPositionY][swordPositionX] = "    >     ";
	}
	
	/*Método que irá mostrar o mapa para o jogador.*/
	public void showMap(Warrior w) {
		
		map[w.getPlayerPositionY()][w.getPlayerPositionX()] = w.getStatus(); //Coloca o WARRIOR no mapa.
		String showing = "";
		
		bossDead(); //Verifica se o BOSS está morto.
        
    	for(int i = 0; i < colunas; i++) {
            
    		showing += "\n |";
            
    		for(int j = 0; j < linhas; j++) {
                showing += map[i][j] + " |";
            }
        }
    	
        System.out.println(showing);
	}
	
	//Desocupa a posição do mapa após o movimento do WARRIOR.
	public void desocupar(Warrior w) {
		map[w.getPlayerPositionY()][w.getPlayerPositionX()] = "          ";
	}
	
	//Verifica se o BOSS está morto.
	private void bossDead() {
		
		if(boss.isDead()) {
			map[boss.getBossPositionY()][boss.getBossPositionX()] = "   ****   ";
		}
		
		else {
			map[boss.getBossPositionY()][boss.getBossPositionX()] = "    @     ";
		}
	}
}