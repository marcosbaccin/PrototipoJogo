/*Algorithm by MACE*/
package prototipoJogo2.movimento;

import prototipoJogo2.warrior.Warrior;

/*Classe concreta que irá implementar o movimento de andar() do personagem.*/
public class Andar implements MovementStrategy {

	@Override
	public void execute(Warrior w) {
		w.andar();
	}
}