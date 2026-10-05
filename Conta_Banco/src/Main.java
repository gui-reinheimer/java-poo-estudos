public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(111, "CF", "Mario");
        ContaBanco c2 = new ContaBanco(222, "CF", "luigi");

        c1.abrirConta();
        //c2.abrirConta();
        c1.depositar(500);

        c1.transferir(-200, c2);

        System.out.println();
        c1.info();
        System.out.println();
        c2.info();
    }
}
