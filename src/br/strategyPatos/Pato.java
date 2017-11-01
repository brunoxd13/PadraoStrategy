package br.strategyPatos;

import br.strategyPatos.interfaces.ComportamentoVoar;
import br.strategyPatos.interfaces.ComportamentoGrasnar;

public class Pato {
	private ComportamentoGrasnar cg;
	private ComportamentoVoar cv;
	
	public Pato( ComportamentoGrasnar cg, ComportamentoVoar cv){
		this.cg = cg;
		this.cv = cv;
	}
	
	public void nadar(){
		
	};
	
	public void display(){
		
	};
	
	public void realizaGrasnar(){
		System.out.println( this.getClass().getSimpleName());
		
		cg.grasnar();
	};
	
	public void realizaVoar(){
		System.out.println( this.getClass().getSimpleName());
		
		cv.voar();
	};
	
}
