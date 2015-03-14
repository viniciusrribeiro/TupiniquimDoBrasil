package br.com.senac.ed.bean;

public class No <T> {
	private T elemento;
	private No <T> proximo;
	
	public No (T elemento) {
		
		this.elemento = elemento;
	}
	
	public T getElemento (){
		
		return elemento;
	}
	
	public No <T> getProximo(){
		
		return proximo;
	}

	public void setElemento (T elemento){
		
		this.elemento = elemento;
	}
	
	public void setProximo (No <T> proximo){
		this.proximo = proximo;
	}

}



