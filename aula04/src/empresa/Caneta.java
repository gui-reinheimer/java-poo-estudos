package empresa;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    boolean tampada;

    public Caneta(String modelo, String cor, double ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " +  this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada: " + this.tampada);
    }
}
