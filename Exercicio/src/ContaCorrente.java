public class ContaCorrente {

    private final int agencia;
    private final int conta;
    private Usuario titular;
    private float saldo;

    public ContaCorrente(int agencia, int conta, Usuario titular){
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        saldo = 0;
    }

    public int getAgencia(){
        return agencia;
    }
    public int getConta(){
        return conta;
    }
    public Usuario getTitular(){
        return titular;
    }
    public void setTitular(Usuario titular){
        this.titular = titular;
    }
    public float getSaldo(){
        return saldo;
    }

    //o metodo pra acessar o saldo vai ser sacar e depositar
    public boolean sacar(float valor){
        if(saldo < valor){
            return false;
        }
        saldo-=valor;
        return true;
    }

    public boolean depositar(float valor){
        saldo += valor;
        return true;
    }

}
