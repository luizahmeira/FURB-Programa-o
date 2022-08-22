import java.util.Scanner; //puxando o scanner da biblioteca

public class ex6 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); //fazendo a leitura do teclado
        
            System.out.print("Informe o primeiro número: "); //é o document.write do java
            int numero1 = terminal.nextInt(); //sempre colocar qual é o tipo de váriavel antes do nome da mesma

            System.out.print("Ïnforme o segundo número: ");
            int numero2 = terminal.nextInt();

            System.out.print("Informe o terceiro número: ");
            int numero3 = terminal.nextInt();

            System.out.print("Informe o quarto número: ");
            int numero4 = terminal.nextInt();

            int diferença = (numero1 * numero2) - (numero3 * numero4);
            System.out.print(diferença);

        terminal.close();
    }
}
