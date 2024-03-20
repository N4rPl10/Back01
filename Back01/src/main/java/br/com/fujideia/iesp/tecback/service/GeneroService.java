package br.com.fujideia.iesp.tecback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero filme) {
        return repository.save(filme);
    }

    public Genero buscarPorId(Integer id) {
        return repository.findById(id).get();
    }

    public List<Genero> listarTodos() {
        return repository.findAll();

    }

    public Genero atualizar(Genero filme) {
        if (filme.getId() == null) {
            throw new RuntimeException("Filme sem ID");
        }
        return repository.save(filme);
    }

    public void remover(Integer filme) {
        if (filme != null) {
            repository.deleteById(filme);
        }
    }

}
