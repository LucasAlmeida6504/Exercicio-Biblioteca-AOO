public abstract class Pessoa{
    public String nome;
    public String codigo;

    public Pessoa(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }  
    
}
