import java.util.Scanner; //ler informaçao do teclado

public class ex2 {
    public static void main(String[] args) {
       //Entrada
        Scanner teclado = new Scanner(System.in); //significa que quer fazer a leitura do teclado 
        //sempre feche o scanner 
       System.out.print("Informe o primeiro número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = teclado.nextInt();
        //processo
        int soma = numero1 * numero2;
        System.out.print("A soma dos números é: " + soma);

        teclado.close(); //fechand o scanner
    }
}
    

