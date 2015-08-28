package br.com.s2it.prova.model;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@DynamicUpdate
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "nf")
public class Nf implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	
	
	public Nf() {
		
	}
	
	public Nf(int nf_id) {
		this.nf_id = nf_id;
	}
	
	
    @ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.EAGER)
    @JoinTable(name="nf_product", joinColumns=
    {@JoinColumn(name="nf_id")}, inverseJoinColumns=
    {@JoinColumn(name="product_id")})
	private List <Product> product =new ArrayList<Product>();
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nf_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="barcode")
	private int barCode;

	
	public int getNf_id() {
		return nf_id;
	}

	public void setNf_id(int nf_id) {
		this.nf_id = nf_id;
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
