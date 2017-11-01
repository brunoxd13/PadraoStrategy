package br.strategyPatos.comportamentos;

import br.strategyPatos.interfaces.ComportamentoGrasnar;

public class Grasnar implements ComportamentoGrasnar {

	@Override
	public void grasnar() {
		System.out.println("Quack");
	}

}
