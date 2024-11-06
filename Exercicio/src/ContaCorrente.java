public class ContaCorrente {

    private final int agencia;
    private final int conta;
    private String titular;
    private float saldo;

    public ContaCorrente(int agencia, int conta, String titular){
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
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public float getSaldo(){
        return saldo;
    }

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
