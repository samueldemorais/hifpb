package br.edu.ifpb.gugawag.hifpbinterpretes.model;

public record DadosListagemInterpreteDTO(long id, String nome, String cpf, String email, String idade) {

    public DadosListagemInterpreteDTO(Interprete interprete) {
        this(interprete.getId(), interprete.getNome(), interprete.getCpf(), interprete.getEmail(), interprete.getIdade());
    }

}
