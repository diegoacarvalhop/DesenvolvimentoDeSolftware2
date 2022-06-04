package br.edu.uniaeso.aluno.lista_um.q27;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;

    public Emprestimo() {
        setPessoa(null);
        setLivro(null);
    }

    public Emprestimo(Pessoa pessoa, Livro livro) {
        setLivro(new Livro());
        setPessoa(new Pessoa());
    }

    public void emprestar() {
        if(getLivro().isEmprestado()) {
            System.out.println("Livro já emprestado para " + getPessoa().getNome() + "!");
        } else {
            getLivro().setEmprestado(true);
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
