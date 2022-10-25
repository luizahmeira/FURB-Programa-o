package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Informe quantos valores serão contados: ");
            int n = terminal.nextInt();
            int valorMaisBaixo = 0;
            int valorAlto = 0;
            int quantidadeValorAlto = 0;

            for(int i = 0; i < n; i++){
                System.out.println("Informe os valores que serão lidos: ");
                int valor = terminal.nextInt();
                
                if(i == 1){
                    valorMaisBaixo = valor;
                } else {
                    if(valor < valorMaisBaixo){
                        valorMaisBaixo = valor;
                    }
                }

                if(valor > 0){
                    quantidadeValorAlto++;
                    valorAlto += valor;
            }
        }
            valorAlto = valorAlto / quantidadeValorAlto;
            System.out.println("O menor valor foi: " + valorMaisBaixo);
            System.out.println("A média dos valores altos foi: " + valorAlto);
        terminal.close();
    }
}
