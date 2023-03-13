package com.pods.fclabs.models;

import java.util.UUID;
public class UsuarioResponse {

    private UUID id;
    private String nome;
    private String nomeMae;
	private EnderecoResponse endereco;
	
    public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public EnderecoResponse getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoResponse endereco) {
		this.endereco = endereco;
	}
}

