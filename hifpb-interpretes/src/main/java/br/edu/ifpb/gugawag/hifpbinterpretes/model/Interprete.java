package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import jakarta.persistence.CascadeType;

@Entity
public class Interprete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String id;

    @Column()
    public String nome;
  
    @Column()
    public String cpf;
    
	@ManyToMany(mappedBy="interpretes", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Horario> horarios;
}