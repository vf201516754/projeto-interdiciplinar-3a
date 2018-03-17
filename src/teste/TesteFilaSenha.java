package teste;

import entity.Fila;

public class TesteFilaSenha {
	
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Senha senha = new Senha();
		fila.insere(senha);
		
		Senha senhaRemovida = fila.remove();
		
		if(fila.vazia()) {
			System.out.println("A fila está vazia");
		}
	}
}
