/*Algorithm by MACE*/
package prototipoJogo2.movimento;

import prototipoJogo2.warrior.Warrior;

/*Classe concreta que irá implementar o movimento de pular() do personagem.*/
public class Pular implements MovementStrategy {

	@Override
	public void execute(Warrior w) {
		w.pular();
	}
}