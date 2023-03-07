package com.pods.fclabs.services.validadorEndereco;

import com.pods.fclabs.exception.EnderecoInvalidoException;
import com.pods.fclabs.models.Endereco;
import com.pods.fclabs.models.Morada;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;
@Component
public class ValidaCamposNulos implements ValidadorEndereco {
    @Override
    public void valida(Endereco endereco) {
        validaCampo(endereco.getCep(), "Campo Cep é obrigatório para cadastro do Endereço");
        validaCampo(endereco.getLogadouro(), "Campo Logadouro é obrigatório para cadastro do Endereço");
        validaMorada(endereco.getMorada(), "Campo Morada é obrigatório para cadastro do Endereço");
        validaCampo(endereco.getNumero(), "Campo Numero é obrigatório para cadastro do Endereço");
        validaCampo(endereco.getBairro(), "Campo Bairro é obrigatório para cadastro do Endereço");
        validaCampo(endereco.getCidade(), "Campo Cidade é obrigatório para cadastro do Endereço");
    }

    private void validaCampo(String campo, String mensagemException) {
        if (isNull(campo) || campo.isEmpty()) {
            throw new EnderecoInvalidoException(mensagemException);
        }
    }
    private void validaMorada(Morada campo, String mensagemException) {
        if (isNull(campo)) {
            throw new EnderecoInvalidoException(mensagemException);
        }
    }
}
