package Unidade005.conteúdo;
public class questionario01 {
    public static void main(String[] args) {
        int resultado = 0;
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            if(vetor[i] % 2 != 0) {
                resultado += vetor[i];
            }
        }
        System.out.println(resultado);
    }
}