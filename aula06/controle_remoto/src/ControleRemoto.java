public class ControleRemoto implements Controlador {
  //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METODOS ESPECIAIS
    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //MÉTODOS ABSTRATOS
    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
        setVolume(0);
        setTocando(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()) {
                System.out.println("Esta ligado? " + this.getLigado());
                System.out.println("Esta tocando? " + this.getTocando());
                System.out.print("Volume: " + this.getVolume() + " ");
                for(int i = 1; i <= this.getVolume(); i+= 10) {
                    System.out.print("|");
                }
                System.out.println();
            } else {
                 System.out.println("Nao esta ligado! impossivel abrir o menu");
        }
        }


    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossivel aumentar Volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel Diminuir Volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("Tocando");
        } else {
            System.out.println("Impossivel play");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()) {
            setTocando(false);
            System.out.println("Pause");
        } else {
            System.out.println("Impossivel pausar");
        }
    }
}
