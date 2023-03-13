package com.pods.fclabs.models;

import lombok.Data;

import java.util.UUID;
@Data
public class EnderecoResponse {
    private UUID id;
    private String cep;
    private String logadouro;
    private Morada morada;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;

    public EnderecoResponse(Endereco endereco) {
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.logadouro = endereco.getLogadouro();
        this.morada = endereco.getMorada();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
    }
}
