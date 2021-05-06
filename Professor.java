public class Professor extends Pessoa{
    
    public String codigo;

    public Professor(String nome,String codigo) {
        super(nome, codigo);
        this.codigo = codigo;
       
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

}
