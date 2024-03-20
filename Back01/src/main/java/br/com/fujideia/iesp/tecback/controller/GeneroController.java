package br.com.fujideia.iesp.tecback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import br.com.fujideia.iesp.tecback.service.GeneroService;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@AllArgsConstructor
@RestController
@RequestMapping("/genero")
public class GeneroController {
    public GeneroService service;

    @GetMapping("buscar_por_id/{id}")
    public Genero obterPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    @GetMapping("buscar_todos")
    public List<Genero> getMethodName() {
        return service.listarTodos();
    }

    @PostMapping("salvar")
    public Genero salvar(Genero filme) {

        return service.salvar(filme);
    }

    @PutMapping("atualizar")
    public Genero putMethodName(@RequestBody Genero entity) {
        return service.atualizar(entity);

    }

    @DeleteMapping("deletar/{id}")
    public String postMethodName(@PathVariable Integer id) {
        service.remover(id);
        return "removido";
    }
}
