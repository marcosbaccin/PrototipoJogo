/*Algorithm by MACE*/
package prototipoJogo2.movimento;

import prototipoJogo2.warrior.Warrior;
/*Interface para o nosso Strategy(referente aos movimentos do personagem).*/
public interface MovementStrategy {

	void execute(Warrior w);
}