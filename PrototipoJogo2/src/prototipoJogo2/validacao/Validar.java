/*Algorithm by MACE*/
package prototipoJogo2.validacao;

import prototipoJogo2.mapa.Map;
import prototipoJogo2.warrior.Warrior;

public class Validar {
	
	
	private ValidarAndar va;
	private ValidarDescer vd;
	private ValidarPular vp;
	private ValidarVoltar vv;
	
	//Referência para um dos objetos ValidationStrategy concretas.
	private ValidationStrategy strategy;
	
	public Validar() {
		
		va = new ValidarAndar();
		vd = new ValidarDescer();
		vp = new ValidarPular();
		vv = new ValidarVoltar();
	}
	
	public void setStrategyToValidarAndar() {
		strategy = va;
	}
	
	public void setStrategyToValidarDescer() {
		strategy = vd;
	}
	
	public void setStrategyToValidarPular() {
		strategy = vp;
	}
	
	public void setStrategyToValidarVoltar() {
		strategy = vv;
	}
	
	public boolean executeStrategy(Map m, Warrior w) {
		return strategy.execute(m, w);
	}
}