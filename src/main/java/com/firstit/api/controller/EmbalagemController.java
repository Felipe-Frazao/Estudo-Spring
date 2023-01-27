package com.firstit.api.controller;

import com.firstit.api.embalagem.Embalagem;
import com.firstit.api.embalagem.EmbalagemRepository;
import com.firstit.api.embalagem.AdicionarEmbalagem;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
