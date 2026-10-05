package aula03_curso_em_video;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }


    protected void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }
}
