package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        float altura = 0;
            for(int i = 0; i < 20; i++){
                System.out.println("Informe a altura de 20 pessoas: ");
                altura += terminal.nextFloat();
                

            }
            altura = altura / 20;
            System.out.println("A média das alturas é: " + altura);
        terminal.close();
    }
}
