package br.com.s2it.prova.model;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



@Entity
@DynamicUpdate
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "product")
public class Product implements Serializable{	
	
	private static final long serialVersionUID = 1L;

	public Product() {
		
	}
	
	public Product(int product_id) {
		this.product_id = product_id;
	}
	
    @ManyToMany(cascade = {CascadeType.ALL}, fetch=FetchType.LAZY)
    /*@JoinTable(name="nf_product", joinColumns=
    {@JoinColumn(name="nf_id")}, inverseJoinColumns=
    {@JoinColumn(name="product_id")})*/
	private List <Nf> nf =new ArrayList<Nf>();
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

    public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public BigDecimal getPrice(){
        return price;
    }

	public List<Nf> getNf() {
		return nf;
	}

	public void setNf(List<Nf> nf) {
		this.nf = nf;
	}
    
    

    
}
