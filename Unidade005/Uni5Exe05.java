package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Informe a quantidade de termos que você deseja q sejam apresentados: ");
            int n = terminal.nextInt();
            int termo = 8, termoAnterior = 8;
            String termosFinal = "";
            
            if(n > 2) {
                for(int contador = 1; contador <= n; contador++) {
                    if(contador > 1) {
                        termosFinal += ", ";
                    }

                    termosFinal += termo;

                    if(contador %2 == 0) { //o contador é par
                        //multiplicação por 2
                        termo = termoAnterior * 2;
                    } else {
                        termoAnterior = termo;
                        termo += 2; //soma por 2
                    }
                }
            } else {
                System.out.println("O número informado deve ser maior que dois");
            }
        System.out.println(termosFinal);

        terminal.close();
    }
}




// 8 + 8 = 16
// 8 + 10 = 18
// 16 + 16 = 32
// 16 + 18 = 34
// 32 + 32 = 64
// 32 + 34 = 66
// 64 + 64 = 128
// 64 + 66 = 130