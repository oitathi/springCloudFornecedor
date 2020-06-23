package com.example.springCloud.fornecedor.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class PedidoItem {

	@Id
	@SequenceGenerator(name = "pedido_item_id_seq", sequenceName = "pedido_item_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_item_id_seq")
	@Column(name = "pedido_item_id")
	
	/*@Id
	@Column(name = "pedido_item_id", columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	private Long id;
	
	private Integer quantidade;
	
	@ManyToOne @JoinColumn(name = "produto_id")
	private Produto produto;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
