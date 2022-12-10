/*Algorithm by MACE*/
package prototipoJogo2.warrior;
//Implementação da interface - Objeto concreto.
public class SimpleWarrior implements Warrior{
    
	private String status;
	private int playerPositionX;
	private int playerPositionY;

    public SimpleWarrior() {
        
    	this.status = "   -0-    ";
    	this.playerPositionX = 0;
    	this.playerPositionY = 0;
    }

    @Override
    public void andar() {
    	this.playerPositionX++;
    }

    @Override
    public void voltar() {
    	this.playerPositionX--;
    }

    @Override
    public void pular() {
    	this.playerPositionY--;
    }

    @Override
    public void descer() {
    	this.playerPositionY++;
    }

    @Override
    public String getStatus() {
        return this.status;
    }
    
    @Override
    public int getPlayerPositionX() {
    	return this.playerPositionX;
    }
    
    @Override
    public int getPlayerPositionY() {
    	return this.playerPositionY;
    }
}