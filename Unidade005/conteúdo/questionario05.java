package Unidade005.conteúdo;

public class questionario05 {
    public static void main(String[] args) {
        
        int vetor_1[] = { 1,2,3,4,7,11,11,13};
        int vetor_2[] = { 5,6,7,8,8,7,6,5};
        int vetor_3[] = new int[4];

        int indice_1 = 0;
        int indice_2 = 7;

        while (indice_2 > indice_1) {
            vetor_3[indice_1] = vetor_1[indice_1] + vetor_2[indice_2];
            indice_1 ++;
            indice_2 --;
        }

        for (int i = 0; i < vetor_3.length; i++) {
            System.out.println(vetor_3[i] + ", ");
        }
    }
}
