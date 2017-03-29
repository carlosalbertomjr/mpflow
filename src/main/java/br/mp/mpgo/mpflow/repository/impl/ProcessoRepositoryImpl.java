package br.mp.mpgo.mpflow.repository.impl;

import java.util.ArrayList;
import java.util.List;

//import org.flowable.engine.RepositoryService;
//import org.flowable.engine.repository.ProcessDefinition;
//import org.flowable.engine.repository.ProcessDefinitionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.mp.mpgo.mpflow.domain.Processo;
import br.mp.mpgo.mpflow.repository.ProcessoRepository;

@Repository
public class ProcessoRepositoryImpl implements ProcessoRepository {
	
//	@Autowired
//	RepositoryService repositoryService;
	
	List<Processo> listaProcessos = new ArrayList<Processo>();
	
	
	public ProcessoRepositoryImpl() {
		Processo p = new Processo("Processo A", "But why smiling man her imagine married. Chiefly can man her out believe manners cottage colonel unknown.");
		listaProcessos.add(p);
		p = new Processo("Processo B", "Had denoting properly jointure you occasion directly raillery. In said to of poor full be post face snug.");
		listaProcessos.add(p);
		p = new Processo("Processo C", "At ourselves direction believing do he departure. Celebrated her had sentiments understood are projection set.");
		listaProcessos.add(p);
		p = new Processo("Processo D", "Remember outweigh do he desirous no cheerful. Do of doors water ye guest. We if prosperous comparison middletons at.");
		listaProcessos.add(p);
		p = new Processo("Processo E", "Remember outweigh do he desirous no cheerful. Do of doors water ye guest. We if prosperous comparison middletons at.");
		listaProcessos.add(p);
	}

	public List<Processo> getTodosProcessos() {
//		ProcessDefinitionQuery definitionQuery = repositoryService.createProcessDefinitionQuery();
//		List<ProcessDefinition> processosFlowable = definitionQuery.list(); 
//		
//		listaProcessos.clear();
//		for(ProcessDefinition processoFlowable: processosFlowable) {
//			listaProcessos.add(new Processo(processoFlowable.getName(), processoFlowable.getDescription()));
//		}
//
		return listaProcessos;
	}

}
