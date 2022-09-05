package exercícios;
import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
         //ENTRADAS
         System.out.println("Informe as horas trabalhadas: ");
         int horasTrabalhadas = terminal.nextInt();
         System.out.println("Informe o valor da hora trabalhada: ");
         float valorHoras = terminal.nextFloat();
         //PROCESSO
         float salario = horasTrabalhadas * valorHoras;
         //SAÍDA
         if(horasTrabalhadas > 160) {
             float salarioExtra = (horasTrabalhadas - 160f) * (valorHoras/2f);
             System.out.print("Seu sálario é: " + (salario + salarioExtra));
         } else {
             System.out.println("Seu sálario é: " + salario);
         }
         terminal.close();
     }
 }
    
