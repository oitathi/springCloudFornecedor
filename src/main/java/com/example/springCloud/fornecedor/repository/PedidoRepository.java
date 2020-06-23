package com.example.springCloud.fornecedor.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.springCloud.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
