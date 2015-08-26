package br.com.s2it.prova.model;

import javax.persistence.*;

import java.io.Serializable;



@Entity
@Table(name = "nf")
public class Nf implements Serializable{	
	
	private static final long serialVersionUID = 1L;

	public Nf() {
		
	}
	public Nf(int id) {
		this.id = id;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="barcode")
	private int barCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}
	
	

}
