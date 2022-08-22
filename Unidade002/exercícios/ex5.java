import java.util.Scanner; //ler informaçao do teclado

public class ex5 {
    public static void main(String[] args) {
       //Entrada
        Scanner teclado = new Scanner(System.in); //significa que quer fazer a leitura do teclado 
        //sempre feche o scanner 
       System.out.print("Informe a primeiro nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Informe o segundo número: ");
        double nota2 = teclado.nextDouble();
        //processo
        double soma = (nota1 * 0.35) + (nota2 * 0.75);
        System.out.print("Sua média é: " + soma);
        
        teclado.close(); //fechand o scanner
    }
} 