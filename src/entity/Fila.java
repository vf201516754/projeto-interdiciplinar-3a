package entity;

import java.util.LinkedList;
import java.util.List;

/**Classe para gerenciar uma fila.
 * 
 * @author Victor Ferreira dos Santos
 *
 */

public class Fila {
	
	private List<Object> objetos = new LinkedList<Object>();

	/**metodo para insere uma senha na fila (coloca uma Senha no final da Fila)
	 * 
	 * @author Victor Ferreira dos Santos
	 *       
	 */ 
	
	public void insere(Object objeto) {
		this.objetos.add(objeto);
	}
	
	/**metodo para remove uma senha da fila (retira uma Senha do começo da Fila)
	 * 
	 * @author Victor Ferreira dos Santos
	 * 
	 */ 
	
	public Object remove() {
		return this.objetos.remove(0);
	}
	
	/**Metodo para informa se a fila esta vazia
	 * 
	 * @author Victor Ferreira dos Santos
	 * 
	 */ 
	public boolean vazia() {
		return this.objetos.size() == 0;
	}
 
}
