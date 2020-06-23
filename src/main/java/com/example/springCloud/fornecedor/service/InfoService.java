package com.example.springCloud.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springCloud.fornecedor.model.InfoFornecedor;
import com.example.springCloud.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
		
	}
	
}
