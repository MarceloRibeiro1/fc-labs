package com.pods.fclabs.services;

import com.pods.fclabs.exception.CampoObrigatorioException;
import com.pods.fclabs.models.Usuario;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ValidaCamposObrigatoriosServiceTest {
    ValidaCamposObrigatoriosService validador = new ValidaCamposObrigatoriosService();


    @Test
    public void testValidaCamposId() {
        // GIVEN um usuario sem id
        Usuario usuario = new Usuario();

        // WHEN tentar ser validado
        // THEN vai dar uma exception
        assertThrows(CampoObrigatorioException.class,() -> validador.validaIdUsuario(usuario.getId()));
    }
    @Test
    public void testValidaCamposObrigatorios() {
        Usuario usuario = new Usuario();

        assertThrows(CampoObrigatorioException.class,() -> validador.validaCamposObrigatoriosUsuario(usuario));

    }
}