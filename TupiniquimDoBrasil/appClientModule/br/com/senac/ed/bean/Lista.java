
package br.com.senac.ed.bean;


public class Lista<T> {

	private No <T> primeiro;
	
	public Lista(){
		primeiro = null;
	}
	
		
	public void inserir (T elemento){
		
		if (primeiro == null){
			No <T> first = new No <T> (elemento);
			first.setProximo(this.primeiro);			
			this.primeiro = first;
			No <T> novo = new No <T> (elemento);
			novo.setElemento(elemento);
			novo.setProximo(null);
			
		}	
		
		else {
			No <T> novo = new No <T> (elemento);
			novo.setElemento(elemento);
			novo.setProximo(null);	
		}
		
		
		
		}
	
	 public void remover (){
		
		 

	 }
	}




