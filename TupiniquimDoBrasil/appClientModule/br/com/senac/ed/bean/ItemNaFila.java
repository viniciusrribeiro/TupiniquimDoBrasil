
package br.com.senac.ed.bean;

import java.util.List;


public class ItemNaFila {
	//atributos
	private Pessoa pessoa;
	private List<Documento> documentos;
	private long tempoDeEspera;
	private double tipoPessoa = Math.random ();
	public int minutos = 0;
	public int hora = 60;
	int horario;
	
	Lista lista = new Lista();
	Caixa caixa = new Caixa();
	
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
	{


	
	switch (horario){
	
		case (11): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
				
				minutos ++;
			}

		}
		
		case (12): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
		
			}
		}
		
		case (13): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
				
				minutos ++;
			}

		}
		
		case (14): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
				
				minutos ++;
			}

		}
		
		case (15): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
				
				minutos ++;
			}

		}
		
		case (16): {
			while (minutos != 60){ // enquanto o horário não mudar
		
				PessoaNormal normal = new PessoaNormal();
				PessoaPreferencial preferencial = new PessoaPreferencial();
				
			
				normal.setPossibilidade(Math.random() * 1); // seto uma possibilidade random
				if(normal.getPossibilidade() > 0.3) { // se ela for maior que a possibilidade do horário, insere.
					if(caixa.getCaixaVazio() == true){					
						lista.inserir(normal.getNome());		
					}					
				}
				
				else {
							
				}
				
				preferencial.setPossibilidade(Math.random() * 1 );
				if (preferencial.getPossibilidade() > 0.7 ){
					
					lista.inserir(preferencial.getNome());
				}
				
				else 
				{
					
				}
				
				minutos ++;
			}

		}
		
		
		
		
		
	
	}
 }

}
	

