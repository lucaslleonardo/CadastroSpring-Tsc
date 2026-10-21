package com.lucaslleonardo.cadastrotsc.dto.dtoResponse;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

    private String nome;

    private Integer idade;
}
