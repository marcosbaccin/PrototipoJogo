/*Algorithm by MACE*/
package prototipoJogo2.warrior;
//Decorator concreto.
public class SwordWarrior extends WarriorDecorator {
    
	public SwordWarrior(Warrior warrior) {
        super(warrior);
    }

    @Override
    public void andar() {
        super.andar();
    }

    @Override
    public void voltar() {
        super.voltar();
    }

    @Override
    public void pular() {
        super.pular();
    }

    @Override
    public void descer() {
        super.descer();
    }
    
    //MUDANÇA QUE OCORRE.
    @Override
    public String getStatus() {
        return "   -0->   ";
    }
    
    @Override
    public int getPlayerPositionX() {
    	return super.getPlayerPositionX();
    }
    
    @Override
    public int getPlayerPositionY() {
    	return super.getPlayerPositionY();
    }
}