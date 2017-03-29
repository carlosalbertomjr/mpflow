package br.mp.mpgo.mpflow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.mp.mpgo.mpflow.domain.Processo;
import br.mp.mpgo.mpflow.repository.ProcessoRepository;
import br.mp.mpgo.mpflow.service.ProcessoService;

@Service
public class ProcessoServiceImpl implements ProcessoService {
	
	@Autowired
	ProcessoRepository processoRepository;

	public List<Processo> getTodosProcessos() {
		return processoRepository.getTodosProcessos();
	}

}
