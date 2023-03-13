package com.pods.fclabs.services;

import com.pods.fclabs.models.Usuario;
import com.pods.fclabs.models.UsuarioResponse;
import com.pods.fclabs.repositories.UsuarioRepository;
import com.pods.fclabs.util.Util;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UsuarioServiceTest {

    @Mock
    UsuarioRepository repository;
    @Mock
    private Util util;
    @Mock
    private ValidaCamposObrigatoriosService validaCamposObrigatorios;

    @InjectMocks
    private UsuarioService service;

    @Test
    public void testSaveMethod() {
        // GIVEN um usuário válido
        Usuario usuario = new Usuario();

        // WHEN eu salvar o usuário
        UsuarioResponse response = service.salva(usuario);

        ArgumentCaptor<Usuario> captor = ArgumentCaptor.forClass(Usuario.class);


        // THEN ele deverá ser chamado pelo repository com ID e Data de Criação
        Mockito.verify(repository, Mockito.times(1)).save(captor.capture());
        assertNotNull(captor.getValue().getId());
        assertNotNull(captor.getValue().getDtCriacao());
        assertNotNull(captor.getValue().getDtUltAlteracao());
    }

}