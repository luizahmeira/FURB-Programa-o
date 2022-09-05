package exercícios;

import java.util.Scanner;
public class ex004 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Informe um número maior que 0: ");
        float num = terminal.nextFloat();
        
        int num1 = (int) num;
        float resto = num - num1;

        if(resto == 0) {
            System.out.println("O número " + num + " é inteiro");
       } else{
            System.out.println("O número " + num + " é decimal");
       } 
        terminal.close();
    }
}
