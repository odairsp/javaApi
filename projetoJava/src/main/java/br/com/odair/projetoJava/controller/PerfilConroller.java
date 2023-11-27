package br.com.odair.projetoJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.odair.projetoJava.dto.PerfilDTO;
import br.com.odair.projetoJava.service.PerfilService;

@RestController
@RequestMapping("/perfil")
@CrossOrigin
public class PerfilConroller {

	@Autowired
	private PerfilService perfilService;

	@GetMapping
	public List<PerfilDTO> perfis() {
		return perfilService.listarTodos();
	}

	@GetMapping("/{id}")
	public PerfilDTO perfil(@PathVariable("id") Long id) {
		return perfilService.buscarPorId(id);
	}

	@PostMapping
	public void inserir(@RequestBody PerfilDTO perfil) {
		perfilService.inserir(perfil);
	}

	@PutMapping
	public PerfilDTO alterar(@RequestBody PerfilDTO perfil) {
		return perfilService.alterar(perfil);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<PerfilDTO> deletar(@PathVariable("id") Long id) {
		perfilService.excluir(id);
		return ResponseEntity.ok().build();
	}

}
