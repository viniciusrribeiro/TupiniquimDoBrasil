/**
 * 
 */
package br.com.senac.ed.bean;

import java.util.Date;

/**
 * Class Pessoa, representa uma pessoa genérica.
 * @author rcabral
 * @version 1.0
 */
public abstract class Pessoa {
	//atributos
	private String nome;
	private Date dtNascimento;
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}
