public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(111, "CF", "Mario");

        c1.abrirConta();
        c1.depositar(500f);
        System.out.println();
        c1.info();

        c1.sacar(600f);
        System.out.println();
        c1.info();
    }
}
