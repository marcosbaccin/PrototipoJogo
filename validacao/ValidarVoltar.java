/*Algorithm by MACE*/
package prototipoJogo2.validacao;

import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.Warrior;

/*Classe concreta para poder validar o movimento de voltar do personagem.*/
public class ValidarVoltar implements ValidationStrategy {

	@Override
	public boolean execute(Map m, Warrior w) {
		
		if(w.getPlayerPositionX() > 0) {
			return true;
		}
		
		else {
			return false;
		}
	}
}