package com.lucaslleonardo.cadastrotsc.dto.postRequest;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioPost {

    private String nome;

    private String senha;

    private Integer idade;
}
