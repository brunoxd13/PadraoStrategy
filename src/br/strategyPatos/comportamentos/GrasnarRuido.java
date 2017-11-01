package br.strategyPatos.comportamentos;

import br.strategyPatos.interfaces.ComportamentoGrasnar;

public class GrasnarRuido implements ComportamentoGrasnar {

	@Override
	public void grasnar() {
		System.out.println("GrGrGr");
	}

}
