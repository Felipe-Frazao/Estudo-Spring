package com.firstit.api.embalagem;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record AdicionarEmbalagem(

        @NotNull
        Codigo codigo,
        @NotNull
        int quantidade
) {
}
