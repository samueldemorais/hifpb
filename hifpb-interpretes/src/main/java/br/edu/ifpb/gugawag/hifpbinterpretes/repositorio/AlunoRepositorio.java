package br.edu.ifpb.gugawag.hifpbinterpretes.repositorio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.ifpb.gugawag.hifpbinterpretes.model.Aluno;


public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

    List<Aluno> findAll();

    @Query("SELECT a FROM Aluno a WHERE a.idade > 18")
    List<Aluno> findMaioresDe18Anos();
}
