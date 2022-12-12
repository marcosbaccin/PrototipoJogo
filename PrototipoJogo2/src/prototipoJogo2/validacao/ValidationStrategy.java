/*Algorithm by MACE*/
package prototipoJogo2.validacao;

import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.Warrior;

/*Utilizamos tambêm o padrão Strategy para podermos validar os movimentos do personagem.*/
public interface ValidationStrategy {

	boolean execute(Map m, Warrior w);
}