/**
 * 
 */
package br.com.senac.ed.bean;

import java.util.List;

/**
 * Class ItemNaFila, representa um item na fila. 
 * Sendo que este item é uma pessoa com documentos e que tem um contador de tempo de espera.
 * @author rcabral
 *
 */
public class ItemNaFila {
	//atributos
	private Pessoa pessoa;
	private List<Documento> documentos;
	private long tempoDeEspera;
	
	//getters and setters
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Documento> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	public long getTempoDeEspera() {
		return tempoDeEspera;
	}
	public void setTempoDeEspera(long tempoDeEspera) {
		this.tempoDeEspera = tempoDeEspera;
	}	
	
	
}
