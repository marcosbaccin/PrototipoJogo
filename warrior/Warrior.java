/*Algorithm by MACE*/
package prototipoJogo2.warrior;
/*Interface do nosso personagem.*/
public interface Warrior {
    
	void andar();
    
	void pular();
    
	void descer();
    
	void voltar();
    
	String getStatus();
	
	int getPlayerPositionX();
	
	int getPlayerPositionY();
}