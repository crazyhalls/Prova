package br.com.s2it.prova.model;

import java.io.Serializable;
import java.util.List;

public class Resource<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<T> items;

	public Resource(List<T> items){
		this.items = items;
	}
	
	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
}
