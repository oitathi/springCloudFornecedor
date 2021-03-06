package com.example.springCloud.fornecedor.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity

public class InfoFornecedor {

	@Id
	@SequenceGenerator(name = "info_id_seq", sequenceName = "info_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "info_id_seq")
	@Column(name = "fornecedor_id")
	
	/*@Id
	@Column(name = "fornecedor_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	private Long id;
	
	private String nome;
	
	private String estado;
	
	private String endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
