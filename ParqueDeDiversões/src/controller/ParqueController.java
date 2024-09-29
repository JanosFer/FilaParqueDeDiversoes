package controller;

import br.com.filagenerica.Fila;
import model.Pessoa;

public class ParqueController {
	public void brinquedo(Fila<Pessoa> fila) {
		Pessoa aux = new Pessoa();
		
		while(!fila.isEmpty()) {
			try {
				aux = fila.remove();
			} catch (Exception e) {
				System.err.println();
			}
			
			if(aux.getIdade() < 16) {
				System.out.println(aux.getNome() + " não passou para o brinquedo porque possui menos de 16 anos!");
			}else if (aux.getAltura() < 1.60) {
				System.out.println(aux.getNome() + " não passou para o brinquedo porque possui menos de 1.60m!");
			}else {
				System.out.println(aux.getNome() + " passou para o brinquedo!");
			}
			
		}
	}
}
