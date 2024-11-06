//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(1, 11, "Jose");

        c1.depositar(200);
        if (c1.sacar(100)) {
            System.out.println("Saque realizado com sucesso!");
        }
        if (c1.sacar(1000)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("O saque falhou!");
        }
    }
}