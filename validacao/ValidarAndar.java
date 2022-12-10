/*Algorithm by MACE*/
package prototipoJogo2.validacao;

import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.Warrior;

/*Classe concreta para poder validar o movimento de andar do personagem.*/
public class ValidarAndar implements ValidationStrategy {

	@Override
	public boolean execute(Map m, Warrior w) {
		
		if(w.getPlayerPositionX() < m.getLinhas()-1) {
			return true;
		}
		
		else {
			return false;
		}
	}
}