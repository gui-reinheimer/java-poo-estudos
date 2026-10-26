public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Guilherme", 29, Sexo.M);
        p[1] = new Pessoa("Diana", 28, Sexo.F);

        l[0] = new Livro("Aprendendo java", "José Bezerra", 300, p[0]);
        l[1] = new Livro("POO", "Maira Fagundes", 500, p[1]);
        l[2] = new Livro("SQL na Pratica", "Pedro Guedes", 200, p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avanPag();
        l[0].voltarPag();
        l[0].voltarPag();


        System.out.println(l[0].detalhes());
    }
}
