package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            String nome;
            float nota1 = 0;
            float nota2 = 0;
            float media = 0;

            while(true) {
               System.out.println("Informe o nome do aluno: ");
               nome = terminal.next();

               if(nome.equals("fim")) {
                    break;
               }
               
               System.out.println("Informe a nota desse aluno: ");
               nota1 = terminal.nextFloat();

               System.out.println("Informe a segunda nota desse aluno: ");
               nota2 = terminal.nextFloat();

               media = (nota1 + nota2) / 2;
               System.out.println("A média de " + nome + " foi: " + media);
            }

        terminal.close();
    }
}
