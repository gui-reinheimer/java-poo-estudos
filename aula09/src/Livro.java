public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.leitor = leitor;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro: " + titulo +
                "\nautor = " + autor +
                "\ntotPag = " + totPag +
                "\npagAtual = " + pagAtual +
                "\naberto = " + aberto +
                "\nleitor = " + leitor.getNome() +
                "\nIdade = " + leitor.getIdade() +
                "\nSexo = " + leitor.getSexo();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }


    @Override
    public void folhear(int p) {
        if (p > this.totPag || p < 0) {
            System.out.println("Esse livro possui apenas " + totPag + " paginas");
        } else if (!aberto) {
            System.out.println("Livro fechado");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avanPag() {
        if (!aberto) {
            System.out.println("Livro fechado");
        } else if (pagAtual >= this.totPag) {
            System.out.println("Chegou ao fim");
        } else {
            pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (!aberto) {
            System.out.println("Livro fechado");
        } else if (pagAtual <= 0 ) {
            System.out.println("Impossivel voltar");
        } else {
            pagAtual--;
        }
    }
}
