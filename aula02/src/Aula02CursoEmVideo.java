package aula02_curso_em_video;

public class Aula02CursoEmVideo {
    public static void main(String[] args) {
        /*
        * Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;

        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.print("---------------------\n");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelho";
        c2.ponta = 0.7f;
        c2.carga = 50;
        c2.tampada = false;

        c2.status();
        c2.rabiscar();*/

        Carro carro01 = new Carro();
        carro01.modelo = "Civic";
        carro01.cor = "branco";
        carro01.ano = 2021;
        carro01.preco = 150000.99f;
        carro01.ligado = true;

        carro01.status();
        carro01.buzinar();
    }
}
