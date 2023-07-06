package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import jakarta.persistence.CascadeType;
import java.time.LocalDate;

@Entity
public class Horario {
    public LocalDate horario;

	@ManyToMany(mappedBy="horarios", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Interprete> interpretes;
}

