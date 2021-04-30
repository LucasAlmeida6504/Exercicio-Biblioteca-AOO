
public class Main {
    public static void main(String[] args) {

        Autor Autor1 = new Autor("\n Autor: "+ "Stephen Hawking.", "\n Nacionalidade: Reino Unido.");
        System.out.println(Autor1.nome+" "+Autor1.nacionalidade);

        Autor Autor2 = new Autor("\n Autor: "+ "Stephen Covey.", "\n Nacionalidade: Estados Unidos.");
        System.out.println(Autor2.nome+" "+Autor2.nacionalidade);

        Aluno Aluno1 = new Aluno(" Lucas","001.");
        Professor Professor1 = new Professor(" Efrain","002.\n\n\n");

        Livro Livro1 = new Livro("\n Nome do livro: "+"Uma breve história do tempo.", Autor1);
        System.out.println(Livro1.nome+" "+ Autor1.nome);

        System.out.println(" Emprestado por:"+Aluno1.nome + ". \n Código: " + Aluno1.codigo);
        
        Livro Livro2 = new Livro("\n Nome do livro: "+"Os 7 hábitos das pessoa altamente eficazes.", Autor2);
        System.out.println(Livro2.nome+" "+ Autor2.nome);
        System.out.println(" Emprestado por:"+Professor1.nome + ". \n Código: " + Professor1.codigo);
        
    }
}
