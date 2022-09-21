import java.util.Scanner;
public class Uni4Exe12 {
   public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Informe o comprimento do lado 1: ");
    float lado1 = terminal.nextFloat();

    System.out.println("Informe o comprimento do lado 2: ");
    float lado2 = terminal.nextFloat();

    System.out.println("Informe o comprimento do lado 3: ");
    float lado3 = terminal.nextFloat();

    if(lado1 > (lado2 + lado3) || lado2 > (lado1 + lado3) || lado3 > (lado2 + lado1)) {
        System.out.println("Não é um triângulo");
        }

        else if (lado1 < (lado2 + lado3) || lado2 < (lado1 + lado3) || lado3 < (lado2 + lado1)) {
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("é equilatero");
            } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("é isósceles");
            } else if(lado1 != lado2 && lado2 != lado3){
            System.out.println("é um escaleno"); } 

        }
        
    terminal.close();
}}
   
   
