public class ContaBanco {
       private int numConta;
       private String tipo;
       private String dono;
       private float saldo;
       private boolean status;

       public ContaBanco(int numConta, String tipo, String dono) {
           this.numConta = numConta;
           this.tipo = tipo;
           this.dono = dono;
           saldo = 0f;
           status = false;
       }


       public float getSaldo() {
           return saldo;
       }

       public void abrirConta() {
           this.status = true;
       }

       public void fecharConta() {
           if(!status){
               System.out.println("A conta já está fechada.");
           } else if(saldo == 0) {
               this.status = false;
               System.out.println("Conta Fechada");
           } else {
               System.out.println("Para fechar conta deve sacar todo o valor");
           }
       }

       public float depositar(float valor) {
           if (status && valor > 0) {
               saldo += valor;
               System.out.println("Depositado com sucesso!");
           } else {
               System.out.println("Erro ao depositar!");
           }
           return saldo;
       }

       public float sacar(float valor){
           if (this.status && valor > 0 && valor <= this.saldo) {
               saldo -= valor;
               System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
           } else {
               System.out.println("ERRO ao sacar! Verifique o saldo ou se conta está aberta");
           }
           return saldo;
       }

       public float transferir(float valor, ContaBanco conta){
           if (this.status && conta.status && valor > 0 &&  valor <= this.saldo) {
               saldo -= valor;
               conta.saldo += valor;
           } else {
               System.out.println("Impossivel transferir");
               System.out.println("Verificar se conta existe.\nOu se possui saldo suficiente.");
           }
           return saldo;
       }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void info(){
           System.out.println("----CONTA----");
           System.out.println("Numero da conta: " + this.getNumConta());
           System.out.println("Tipo da conta: " + this.getTipo());
           System.out.println("Dono da conta: " + this.getDono());
           System.out.println("Saldo da conta: " + this.getSaldo());
           System.out.println("Status? " + this.isStatus());
       }

}
