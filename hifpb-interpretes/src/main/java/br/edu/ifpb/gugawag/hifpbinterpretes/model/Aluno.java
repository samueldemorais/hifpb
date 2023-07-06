package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import jakarta.persistence.CascadeType;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;
 
    public String matricula;

    public String curso;

    
	@ManyToMany(mappedBy="alunos", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Horario> horarios;

    public Aluno() {
        this.horarios = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }

}