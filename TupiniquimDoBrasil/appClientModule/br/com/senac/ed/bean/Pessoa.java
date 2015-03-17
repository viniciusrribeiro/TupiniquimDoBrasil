/**
 * 
 */
package br.com.senac.ed.bean;


/**
 * Class Pessoa, representa uma pessoa genérica.
 * @author rcabral
 * @version 1.0
 */
public abstract class Pessoa {
	//atributos
	protected String nome;
	protected int idade;
	protected double possibilidade = 0.0;

	
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDtNascimento() {
		return idade;
	}
	public void setDtNascimento(int idade) {
		this.idade = idade;
	}
	
	
}
