package br.patos;

import br.strategyPatos.Pato;
import br.strategyPatos.interfaces.ComportamentoGrasnar;
import br.strategyPatos.interfaces.ComportamentoVoar;

public class PatoCabecaVermelha extends Pato {

	public PatoCabecaVermelha(ComportamentoGrasnar cg, ComportamentoVoar cv) {
		super(cg, cv);
	}

}
