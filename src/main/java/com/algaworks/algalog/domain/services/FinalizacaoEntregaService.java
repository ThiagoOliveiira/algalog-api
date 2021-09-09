package com.algaworks.algalog.domain.services;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {

	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaEntregaService;
	
	public void finalizar(Long idEntrega) {
		Entrega entrega = buscaEntregaService.buscar(idEntrega);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
}
