package com.firstit.api.embalagem;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record AdicionarEmbalagem(
        @NotBlank
        Codigo codigo,
        @NotEmpty
        int quantidade
) {
}
