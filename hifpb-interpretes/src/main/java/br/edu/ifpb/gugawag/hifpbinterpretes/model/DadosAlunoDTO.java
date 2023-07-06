package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import jakarta.validation.constraints.NotBlank;


public record DadosAlunoDTO(Long id, @NotBlank String nome, 
         @NotBlank String matricula, @NotBlank String curso) {
}
