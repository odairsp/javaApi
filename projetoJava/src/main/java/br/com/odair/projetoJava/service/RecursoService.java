package br.com.odair.projetoJava.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.odair.projetoJava.dto.RecursoDTO;
import br.com.odair.projetoJava.entity.RecursoEntity;
import br.com.odair.projetoJava.repository.RecursoRepository;

@Service
public class RecursoService {
	
	@Autowired
	private RecursoRepository recursoRepository;
	
	public List<RecursoDTO> listarTodos(){
		List<RecursoEntity> recursos = recursoRepository.findAll();
		return recursos.stream().map(RecursoDTO::new).toList();
	}
	
	public void inserir(RecursoDTO recursoDTO) {
		RecursoEntity recursoEntity = new RecursoEntity(recursoDTO);
		recursoRepository.save(recursoEntity);
	}

	public RecursoDTO alterar(RecursoDTO recursoDTO) {
		RecursoEntity recursoEntity = new RecursoEntity(recursoDTO);
		return new RecursoDTO(recursoRepository.save(recursoEntity));
	}

	public void excluir(Long id) {
		RecursoEntity recurso = recursoRepository.findById(id).get();
		recursoRepository.delete(recurso);
	}

	public RecursoDTO buscarPorId(Long id) {
		return new RecursoDTO(recursoRepository.findById(id).get());
	}

}
