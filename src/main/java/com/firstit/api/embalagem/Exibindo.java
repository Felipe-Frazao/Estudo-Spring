package com.firstit.api.embalagem;

import jakarta.validation.constraints.NotNull;

public record Exibindo(
        @NotNull
        Codigo codigo,
        @NotNull
        int quantidade
) {

        public Exibindo(Embalagem embalagem){
                this(embalagem.getCodigo(),embalagem.getQuantidade());
        }
}
