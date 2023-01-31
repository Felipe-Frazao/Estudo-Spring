package com.firstit.api.embalagem;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizar(
        @NotNull
        Long id,
        @NotNull
        int quantidade
) {
}
