package com.lucaslleonardo.cadastrotsc.service;

import com.lucaslleonardo.cadastrotsc.dto.postRequest.UsuarioPost;
import com.lucaslleonardo.cadastrotsc.entity.UsuarioEntity;
import com.lucaslleonardo.cadastrotsc.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final IUsuarioRepository usuarioRepository;

    public void criarUsuario(UsuarioPost usuarioPost) {

        usuarioRepository.save(UsuarioEntity.builder()
                .nome(usuarioPost.getNome())
                .idade(usuarioPost.getIdade())
                .senha(usuarioPost.getSenha())
                .build());
    }
}
