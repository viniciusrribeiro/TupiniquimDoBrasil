/**
 * 
 */
package br.com.senac.ed.bean;

/**
 * Class PessoaNormal, especializa uma pessoa genérica.</br>
 * Logo, uma pessoa normal é uma pessoa concreta.
 * @author rcabral
 * @version 1.0
 */
public class PessoaNormal extends Pessoa{
	
	public PessoaNormal (){
		
		super();
	}
	
	double possibilidade = 0.0;

	public double getPossibilidade() {
		
		return possibilidade;
	}

	public void setPossibilidade(double possibilidade){
		
		this.possibilidade = possibilidade;
	}
	
	
}
