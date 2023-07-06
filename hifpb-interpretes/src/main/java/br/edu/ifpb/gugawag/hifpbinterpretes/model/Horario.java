package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.CascadeType;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate data;
    public LocalTime hora;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Interprete> interpretes;

    @ManyToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Aluno> alunos;

    public Horario(Long id, LocalDate data, LocalTime hora, ArrayList<Interprete> interpretes,
            ArrayList<Aluno> alunos) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.interpretes = interpretes;
        this.alunos = alunos;
    }

    public Horario(){ }
}
