/**
 * 
 */
package br.com.senac.ed.bean;

/**
 * @author rcabral
 *
 */
public class Caixa {
	//atributos
	private String atendente;
	private long contabil;
	private long tempoAtendimento;
	
	//getters and setters
	public String getAtendente() {
		return atendente;
	}
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	public long getContabil() {
		return contabil;
	}
	public void setContabil(long contabil) {
		this.contabil = contabil;
	}
	public long getTempoAtendimento() {
		return tempoAtendimento;
	}
	public void setTempoAtendimento(long tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}
}
