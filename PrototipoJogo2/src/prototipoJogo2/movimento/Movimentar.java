/*Algorithm by MACE*/
package prototipoJogo2.movimento;

import prototipoJogo2.warrior.Warrior;

public class Movimentar {
	
	private Andar a;
	private Descer d;
	private Pular p;
	private Voltar v;
	
	//Referência para um dos objetos MovementeStrategy concretos.
	private MovementStrategy strategy;
	
	public Movimentar() {
		
		a = new Andar();
		d = new Descer();
		p = new Pular();
		v = new Voltar();
	}

	public void setStrategyToAndar() {
		strategy = a;
	}
	
	public void setStrategyToDescer() {
		strategy = d;
	}
	
	public void setStrategyToPular() {
		strategy = p;
	}
	
	public void setStrategyToVoltar() {
		strategy = v;
	}
	
	public void executeStrategy(Warrior w) {
		strategy.execute(w);
	}
}