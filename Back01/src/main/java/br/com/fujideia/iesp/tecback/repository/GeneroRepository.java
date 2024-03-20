package br.com.fujideia.iesp.tecback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.model.Filme;

public interface GeneroRepository extends JpaRepository<Genero, Integer> {

}
