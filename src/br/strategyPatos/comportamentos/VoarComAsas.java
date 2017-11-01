package br.strategyPatos.comportamentos;

import br.strategyPatos.interfaces.ComportamentoVoar;

public class VoarComAsas implements ComportamentoVoar {

	@Override
	public void voar() {
		System.out.println("vuando");
	}

}
