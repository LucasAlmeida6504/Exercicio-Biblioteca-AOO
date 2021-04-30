public class Autor extends Pessoa {
    
    public String nacionalidade;


    public Autor(String nome, String nacionalidade) {
        super(nome, nacionalidade);
        this.nacionalidade = nacionalidade;
    }

    public String getnacionalidade() {
        return nacionalidade;
    }

    public void setnacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


}
