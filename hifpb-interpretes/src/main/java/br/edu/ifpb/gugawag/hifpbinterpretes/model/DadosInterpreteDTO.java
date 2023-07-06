package br.edu.ifpb.gugawag.hifpbinterpretes.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosInterpreteDTO (Long id, @NotBlank String nome, 
         @NotBlank @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}", 
                message = "CPF Inválido! Deve ter 11 dígitos.") String cpf, @NotBlank Integer idade){
    
}
