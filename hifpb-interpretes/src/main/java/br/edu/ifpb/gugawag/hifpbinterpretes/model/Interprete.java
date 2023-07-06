package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import jakarta.persistence.CascadeType;

@Entity
public class Interprete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nome;
 
    public String cpf;

    public String email;

    public String idade;
    
	@ManyToMany(mappedBy="interpretes", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
    public ArrayList<Horario> horarios;

    public Interprete() {
        this.horarios = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getIdade() {
        return idade;
    }

}