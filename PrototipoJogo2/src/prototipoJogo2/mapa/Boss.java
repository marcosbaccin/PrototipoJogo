/*Algorithm by MACE*/
package prototipoJogo2.mapa;
/*Classe relacionada ao Boss do jogo.*/
public class Boss {
	
	/*Atributos desse boss, onde iremos ter sua posição no mapa e o fator que determina se está vivo ou morto.*/
	private int bossPositionY;
	private int bossPositionX;
	private boolean dead;
	
	/*Construtor da classe Boss.*/
	public Boss(int bossPositionY, int bossPositionX) {
		
		this.bossPositionY = bossPositionY;
		this.bossPositionX = bossPositionX;
		this.dead = false;
	}
	
	/*Retorna se o Boss está vivo ou não de acordo com a variável booleana dead.*/
	public boolean isDead() {
		return dead;
	}
	
	/*setter da variável booleana dead. Esse setter irá determinar se o Boss morreu ou não.*/
	public void setDead(boolean dead) {
		this.dead = dead;
	}
	
	/*Método que irá retornar a posição do Boss referente ao eixo X do mapa.*/
	public int getBossPositionX() {
		return bossPositionX;
	}
	
	/*Método que irá retornar a posição do Boss referente ao eixo Y do mapa.*/
	public int getBossPositionY() {
		return bossPositionY;
	}
}