package com.lucaslleonardo.cadastrotsc.controller;

import com.lucaslleonardo.cadastrotsc.dto.postRequest.UsuarioPost;
import com.lucaslleonardo.cadastrotsc.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarUsuario(@RequestBody UsuarioPost usuarioPost) {
        usuarioService.criarUsuario(usuarioPost);
    }
}
