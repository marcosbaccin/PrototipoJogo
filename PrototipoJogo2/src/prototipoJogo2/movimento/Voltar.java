/*Algorithm by MACE*/
package prototipoJogo2.movimento;

import prototipoJogo2.warrior.Warrior;

/*Classe concreta que irá implementar o movimento de voltar() do personagem.*/
public class Voltar implements MovementStrategy {

	@Override
	public void execute(Warrior w) {
		w.voltar();
	}
}