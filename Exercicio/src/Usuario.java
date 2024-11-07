import java.time.LocalDate;

public class Usuario {
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Usuario(String cpf, String nome, LocalDate nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public LocalDate getNascimento(){
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento){
        this.nascimento = nascimento;
    }
}
