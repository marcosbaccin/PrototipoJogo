/*Algorithm by MACE*/
package prototipoJogo2.warrior;
//Decorator, implementação.
public abstract class WarriorDecorator implements Warrior {
    
	Warrior warrior;
    
	public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }
	
	@Override
	public void andar() {
		warrior.andar();
	}
	
	@Override
	public void voltar() {
		warrior.voltar();
	}
	
	@Override
	public void pular() {
		warrior.pular();
	}
	
	@Override
	public void descer() {
		warrior.descer();
	}
	
	@Override
	public String getStatus() {
		return warrior.getStatus();
	}
	
	@Override
	public int getPlayerPositionX() {
		return warrior.getPlayerPositionX();
	}
	
	@Override
	public int getPlayerPositionY() {
		return warrior.getPlayerPositionY();
	}
}