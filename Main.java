
public class Main {
    
    public static void main(String[] args) {

        Autor Autor1 = new Autor("\n Autor: "+ "Stephen Hawking.", "\n Nacionalidade: Reino Unido.");
        Autor Autor2 = new Autor("\n Autor: "+ "Stephen Covey.", "\n Nacionalidade: Estados Unidos.");
        
        Aluno Aluno1 = new Aluno(" Lucas","45568.");
        Professor Professor1 = new Professor(" Efrain","22654.\n\n\n");

        Livro Livro1 = new Livro("\n Nome do livro: " + "Uma breve história do tempo.", Autor1);
        Livro1.emprestadoPor = Aluno1;
        
        Livro Livro2 = new Livro("\n Nome do livro: " + "Os 7 hábitos das pessoa altamente eficazes.", Autor2);
        Livro2.emprestadoPor = Professor1;
        
        System.out.println(Autor1.nome+" "+Autor1.nacionalidade);
        System.out.println(Autor2.nome+" "+Autor2.nacionalidade);
        System.out.println(Livro1.nome+" "+ Autor1.nome);
        System.out.println("\n Emprestado por:" + Livro1.emprestadoPor.nome + ". \n Código: " + Aluno1.codigo);
        System.out.println(Livro2.nome+" "+ Autor2.nome);
        System.out.println("\n Emprestado por:" + Livro2.emprestadoPor.nome + ". \n Código: " + Professor1.codigo);
        
    }
}
