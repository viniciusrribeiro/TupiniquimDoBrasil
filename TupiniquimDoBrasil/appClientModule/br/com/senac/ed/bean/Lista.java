
package br.com.senac.ed.bean;


@SuppressWarnings("hiding")
public class Lista<Pessoa> {

	private No <Pessoa> primeiro;
	
	public Lista(){
		primeiro = null;
	}
	
		
	public void inserir (Pessoa elemento){
		
		if (primeiro == null){
			No <Pessoa> first = new No <Pessoa> (elemento);
			first.setProximo(this.primeiro);			
			this.primeiro = first;
			No <Pessoa> novo = new No <Pessoa> (elemento);
			novo.setElemento(elemento);
			novo.setProximo(null);
			
		}	
		
		else {
			No <Pessoa> novo = new No <Pessoa> (elemento);
			novo.setElemento(elemento);
			novo.setProximo(null);	
		}
		
		
		
		}
	
	 public void remover (){
		
		 

	 }
	}




