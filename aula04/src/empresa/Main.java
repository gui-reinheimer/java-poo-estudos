package empresa;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Amarela", 0.4);
        Caneta c2 = new Caneta("kkk", "Azul", 1.5);

        c1.status();
        c2.status();
    }
}
