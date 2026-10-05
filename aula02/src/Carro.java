package aula02_curso_em_video;

public class Carro {
    String modelo;
    String cor;
    int ano;
    float preco;
    boolean ligado;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ano: " + this.ano);
        System.out.println("preco: " + this.preco);
        System.out.println("ligado: " + this.ligado);
    }


    void buzinar () {
        System.out.println("Buzinar");
        System.out.println("Bep Bep");
    }
}
