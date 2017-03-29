package br.mp.mpgo.mpflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tarefas")
public class TarefaController {

	@RequestMapping("/dashboard")
	public String listTarefas(Model model) {
		
		model.addAttribute("teste", "Olá");
		
		return "tarefas";
	}

}
