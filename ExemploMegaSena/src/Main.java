import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos números quer jogar:");
        int quantNum = scanner.nextInt();
        if(quantNum <6 || quantNum > 20){
            System.out.println("ERRO: Informe um valor entre 6 e 20\n" + "O programa será fechado");
            System.exit(0);
        }

        Jogo jogo = new Jogo(quantNum);

        while(!jogo.isCompleto()){
            System.out.println("Informe o número a ser jogado: ");
            int numero = scanner.nextInt();
            if(jogo.adicionar(numero)){
                System.out.println("Número adicionado");
            }else{
                System.out.println("Número inválido");
            }
        }

        System.out.println("Jogo desordenado " + Arrays.toString(jogo.getNumeros()));
        Arrays.sort(jogo.getNumeros());
        System.out.println("Jogo ordenado " + Arrays.toString(jogo.getNumeros()));

        System.out.println("O preço do seu jogo é R$" + jogo.valorJogo(quantNum));

    }
}