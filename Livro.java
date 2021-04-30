public class Livro{

    String nome;
    public Autor autor;
    public Pessoa emprestadoPor;

    public Livro(String nome, Autor autor) {
        this.autor = autor;
        this.nome = nome;
    }

    public Autor getautor() {
        return this.autor;
    }

    public void setautor(Autor autor) {
        this.autor = autor;
    }

    public Pessoa getemprestadoPor() {
        return this.emprestadoPor;
    }

    public void setemprestadoPor(Pessoa emprestadoPor) {

        this.emprestadoPor = emprestadoPor;
    }
    
}
