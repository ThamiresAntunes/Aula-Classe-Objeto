public class Jogo {

    private int[] numeros;
    private int numAdicionados;

    public Jogo(int quantidade){
        this.numeros = new int[quantidade];
        numAdicionados = 0;
    }

    public boolean isCompleto(){
        //retorna true se a condicao for verdadeira e false se for falsa
        return numAdicionados == numeros.length;
    }

    private boolean ehInvalido(int numero){
        return numero < 1 || numero > 60;
    }

    private boolean estaContido(int numero) {
        for (int i : numeros) {
            if (i == numero) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionar(int numero){
        if(ehInvalido(numero) || estaContido(numero)){
            return false;
        }
        numeros[numAdicionados++] = numero;
        return true;
    }

    public int[] getNumeros(){
        return numeros;
    }

    public double valorJogo(int quantidade){
        switch (quantidade){
            case 6: return 5.0;
            case 7: return 10.0;
            case 8: return 15.0;
            case 9: return 20.0;
            case 10: return 25.0;
            case 11: return 30.0;
            case 12: return 35.0;
            default: System.out.println("Quantidade de números inválida."); break;
        }
        return 0;
    }
}
