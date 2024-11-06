import java.time.LocalDate;

public class Produto {

    private int codigo;
    private String nome;
    private float preco;
    private int quantidade;
    private LocalDate validade;

    public Produto(int codigo, String nome, float preco, int quantidade, LocalDate validade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public float getPreco(){
        return preco;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public LocalDate getValidade(){
        return validade;
    }
    public void setValidade(LocalDate validade){
        this.validade = validade;
    }

}
