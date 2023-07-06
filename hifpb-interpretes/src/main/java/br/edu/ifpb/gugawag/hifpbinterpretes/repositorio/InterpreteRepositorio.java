package br.edu.ifpb.gugawag.hifpbinterpretes.repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifpb.gugawag.hifpbinterpretes.model.Interprete;

public interface InterpreteRepositorio extends JpaRepository<Interprete, Long> {
    List<Interprete> findAll();

    @Query("SELECT i FROM Interprete i WHERE i.idade > 18")
    List<Interprete> findMaioresDe18Anos();
}
