package br.com.s2it.prova.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "nf")
public class Nf implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Nf() {
		
	}
	public Nf(int id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "nf", targetEntity = Product.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Product>product;
	
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
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

}
