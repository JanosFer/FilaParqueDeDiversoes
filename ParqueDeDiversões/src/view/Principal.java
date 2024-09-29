package view;

import br.com.filagenerica.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Fila<Pessoa> fila = new Fila<Pessoa>();
		ParqueController pc = new ParqueController();
		
		for(int i = 0; i < 30; i++) {
			Pessoa p = new Pessoa();
			
			p.setNome("Pessoa" + (i+1));
			p.setIdade((int) (Math.random() * 30) + 10);
			p.setAltura((float) ((float) (Math.random() * 0.65) + 1.35));
			
			fila.insert(p);
		}
		
		pc.brinquedo(fila);
	}
}
