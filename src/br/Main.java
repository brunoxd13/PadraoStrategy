package br;

import br.patos.PatoBorracha;
import br.patos.PatoCabecaVermelha;
import br.patos.PatoReal;
import br.strategyPatos.comportamentos.Grasnar;
import br.strategyPatos.comportamentos.GrasnarMudo;
import br.strategyPatos.comportamentos.GrasnarRuido;
import br.strategyPatos.comportamentos.VoarComAsas;
import br.strategyPatos.comportamentos.VoarNaoVoar;

public class Main {
	
	public static void main(String[] args) {
		PatoBorracha patoBorracha = new PatoBorracha(new GrasnarRuido(), new VoarNaoVoar());
		PatoCabecaVermelha patoVermelho = new PatoCabecaVermelha(new Grasnar(), new VoarComAsas());
		PatoReal patoReal = new PatoReal(new GrasnarMudo(), new VoarNaoVoar());

		patoBorracha.realizaVoar();
		
		patoVermelho.realizaGrasnar();
		
		patoReal.realizaGrasnar();
	}
	
}
