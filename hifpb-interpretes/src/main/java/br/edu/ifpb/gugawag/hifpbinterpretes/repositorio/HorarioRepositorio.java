package br.edu.ifpb.gugawag.hifpbinterpretes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.gugawag.hifpbinterpretes.model.Aluno;
import br.edu.ifpb.gugawag.hifpbinterpretes.model.Horario;
import br.edu.ifpb.gugawag.hifpbinterpretes.model.Interprete;


public interface HorarioRepositorio extends JpaRepository<Horario, Long> {
    List<Horario> findAll();

    List<Horario> findByAluno(Aluno aluno);

    List<Horario> findByInterprete(Interprete interprete);

    List<Horario> findByAlunoAndInterprete(Aluno aluno, Interprete interprete);
}
