package br.edu.ifpb.gugawag.hifpbinterpretes.model;

public record DadosListagemAlunoDTO(long id, String nome, String matricula, String curso) {
    public DadosListagemAlunoDTO(Aluno aluno) {
        this(aluno.getId(), aluno.getNome(), aluno.getMatricula(), aluno.getCurso());
    }
}
