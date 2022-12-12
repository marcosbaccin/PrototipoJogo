/*Algorithm by MACE*/
package prototipoJogo2.validacao;

import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.Warrior;

/*Classe concreta para poder validar o movimento de pular do personagem.*/
public class ValidarPular implements ValidationStrategy {

	@Override
	public boolean execute(Map m, Warrior w) {

		if(w.getPlayerPositionY() > 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
}