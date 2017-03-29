package br.mp.mpgo.mpflow.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.mp.mpgo.mpflow.domain.Processo;
import br.mp.mpgo.mpflow.service.ProcessoService;

@Controller
@RequestMapping("/processos")
public class ProcessoController {

	@Autowired
	ProcessoService processoService;

	@RequestMapping("/dashboard")
	public String listTarefas(Model model) {
		
		model.addAttribute("processos", processoService.getTodosProcessos());
		
		return "processos";
	}
	
	@RequestMapping("/dashboard/bkp")
	public String listTarefasBkp(Model model) {
		
		model.addAttribute("processos", processoService.getTodosProcessos());
		
		return "processos_bkp";
	}
}
