package br.com.odair.projetoJava.dto;

import org.springframework.beans.BeanUtils;

import br.com.odair.projetoJava.entity.UsuarioEntity;

// Cópia da entidade com os atributos que precisa para cria-lo
// Responsavel pelo trafego de dados entre front <=> back DTO(DATA TRANSFER OBJECT)

public class UsuarioDTO {
	private Long id;

	private String nome;

	private String login;

	private String senha;

	private String email;

	public UsuarioDTO() {

	}

	// contrutor que tranforma Entity em DTO
	public UsuarioDTO(UsuarioEntity usuarioEntity) {
		BeanUtils.copyProperties(usuarioEntity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
