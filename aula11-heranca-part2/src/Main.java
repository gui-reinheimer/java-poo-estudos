public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Joao");
        v1.setIdade(23);
        v1.setSexo("M");

        a1.setNome("Pedro");
        a1.setMatricula(111);
        a1.setCurso("Computador");
        a1.setIdade(28);
        a1.setSexo("M");
        a1.pagarMensalidade();

        b1.setNome("Maria");
        b1.setMatricula(112);
        b1.setCurso("Mecanica");
        b1.setBolsa(12.5f);
        b1.setIdade(23);
        b1.setSexo("F");
        b1.pagarMensalidade();

        System.out.println(v1.toString());
        System.out.println(a1.toString());
    }
}
