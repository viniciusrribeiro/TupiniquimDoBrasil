/**
 * 
 */
package br.com.senac.ed.bean;

/**
 * Class Documento, representa um documento genérico* no sistema.</br>
 * *Pode ser de qualquer tipo
 * @author rcabral
 * @version 1.0
 */
public class Documento {
	//atributos
	private double valor;
	
	//constructs
	/**
	 * Inicializa object com valor default 0.0 
	 */
	Documento(){
		setValor(0.0);
	}
	/**
	 * Inicializa object com o valor informado
	 * @param valor
	 */
	Documento(double valor){
		setValor(valor);
	}
	//getters and setters
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
