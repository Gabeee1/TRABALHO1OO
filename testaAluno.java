package exercicio1oo;

class testaAluno {

    public static void main(String[] arg) {


        Aluno gabriel = new Aluno();
        gabriel.nome = "Gabriel";

        gabriel.n1 = 8;
        gabriel.n2 = 6;
        gabriel.n3 = 6;
        gabriel.n4 = 9;
        double media = gabriel.calcularMedia();
        gabriel.idade = 18;
        System.out.println("media de " + gabriel.nome + " que tem " + gabriel.idade + " e " + media);
        gabriel.imprimirSituacao();


        Aluno guilherme = new Aluno();
        guilherme.nome = "Guilherme";
        guilherme.n1 = 8;
        guilherme.n2 = 6;
        guilherme.n3 = 6;
        guilherme.n4 = 9;
        double media2 = guilherme.calcularMedia();
        guilherme.idade = 19;
        System.out.println("Media de " + guilherme.nome + " que tem " + guilherme.idade + " anos e: " + media2);
        guilherme.imprimirSituacao();
    }
}
