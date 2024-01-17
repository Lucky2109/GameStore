package com.generation.gamestore.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.gamestore.repository.CategoriaRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name="tb_produtos")
public class Produtos {
	
	@Id	//tornar esse atributo uma chave primaria do banco de dados
	@GeneratedValue(strategy=GenerationType.IDENTITY)	//adicionar Id como auto increment
	private Long id;
	
	//essa anotação valida o atributo tendo um valor maximo e minimo de caracteres
	@Size(min=1, max = 50, message = "O título deve ter no minimo 5 caracteres e no maximo 100! ")
	@NotBlank(message = "Atributo titulo é obrigatorio")
	private String titulo;
	
	@Size(min=10, max = 1000, message = "O título deve ter no minimo 10 caracteres e no maximo 1000! ")
	@NotBlank(message = "Atributo titulo é obrigatorio")
	private String descricao;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;


	@NotNull
	public Double preco;
	
	@Size(min=1, max = 50, message = "A produtora deve ter no minimo 1 caracteres e no maximo 50! ")
	@NotBlank
	public String produtora;
	
	@Size(min=1, max = 50, message = "A distribuidora deve ter no minimo 1 caracteres e no maximo 50! ")
	@NotBlank
	public String distribuidora;
	
	@Size(min=10, max = 10, message = "A data deve ter no minimo 10 caracteres e no maximo 10! ")
	@NotBlank
	public String datalancamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getDatalancamento() {
		return datalancamento;
	}

	public void setDatalancamento(String datalancamento) {
		this.datalancamento = datalancamento;
	}
	
	

	
	
	
	
}

