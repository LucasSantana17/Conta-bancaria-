package conta;
public class movimentacoes {
     private long CPF = 0;
     private String nome;
     private double saldo = 0;
     private double valor = 0;

    public movimentacoes(long CPF, String nome){
        this.CPF = CPF;
        this.nome = nome;
    }
    public movimentacoes(double valor){
        this.valor = valor;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double Depositar(){
        return saldo = saldo + valor;
    }


}
