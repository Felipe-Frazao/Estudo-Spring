package com.firstit.api.controller;

import com.firstit.api.embalagem.Embalagem;
import com.firstit.api.embalagem.EmbalagemRepository;
import com.firstit.api.embalagem.AdicionarEmbalagem;
import com.firstit.api.embalagem.Exibindo;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Function;

@RestController
@RequestMapping("embalagens")
public class EmbalagemController {

    @Autowired
    EmbalagemRepository repository;

    @PostMapping
    @Transactional
    public void adicionar(@RequestBody @Valid AdicionarEmbalagem embalagem){
        repository.save(new Embalagem(embalagem));
    }

    @GetMapping
    public Page<Exibindo> exibirDados(Pageable paginacao){
        return repository.findAll(paginacao).map(Exibindo::new);
    }

}
