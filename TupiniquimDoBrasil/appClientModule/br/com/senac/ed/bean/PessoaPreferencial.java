/**
 * 
 */
package br.com.senac.ed.bean;

/**
 * Class PessoaPreferencial, especializa uma pessoa genérica. </br>
 * Logo, uma pessoa preferencial tem uma condição/classificação de preferência.
 * @author rcabral
 * @version 1.0
 */
public class PessoaPreferencial extends Pessoa{
	//atributos
	private String condicao;

	//getters and setters
	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
}
