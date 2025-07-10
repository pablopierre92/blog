package br.edu.unirios.blog.entity.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unirios.blog.entity.Autor;

@Repository
public interface RepositorioAutor extends JpaRepository<Autor, Integer> {

}
