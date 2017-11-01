package br.strategyPatos.comportamentos;

import br.strategyPatos.interfaces.ComportamentoVoar;

public class VoarNaoVoar implements ComportamentoVoar {

	@Override
	public void voar() {
		System.out.println("nao avoa");
		
	}

}
