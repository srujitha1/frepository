package com.sapient.productservice.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;


import lombok.Data;
import lombok.ToString;



@Data
@ToString
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "P")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Product implements Serializable{
	
	public Product() {
		super();
	}

	public Product(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
	private long id;
	
	@NotEmpty
    @XmlElement
    @Column(name="name")
	private String name;
	
	@NotNull
    @Range(min = 10, max = 1000, message = "price should be between 10 and 1000")
    @XmlElement
    @Column(name="price")
	private double price;
	
	

}
