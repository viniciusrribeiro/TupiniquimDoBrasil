
package br.com.senac.ed.bean;


public class Caixa {
	//atributos
	private String atendente;
	private long contabil;
	private long tempoAtendimento;
	private boolean vazio;
	
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
	
	public boolean getCaixaVazio(){
		return vazio;
				
	}
	
	public void setCaixaVazio(boolean vazio){
		this.vazio = vazio;
			
	}
	
	
	
	
}
