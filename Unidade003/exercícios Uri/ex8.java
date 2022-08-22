// Enunciado: Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
//  o código de uma peça 2, o número de peças 2 
// e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.


import java.util.Scanner; //ler informaçao do teclado
import java.text.DecimalFormat;
public class ex8 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        
        int item1 = terminal.nextInt();    
        int quantidade1 = terminal.nextInt(); 
        double valor1 = terminal.nextDouble();

        System.out.print(item1);

        int item2 = terminal.nextInt();  
        int quantidade2 = terminal.nextInt(); 
        double valor2 = terminal.nextDouble();

        System.out.print(item2);

        double pagamento = (valor1 * quantidade1) + (valor2 * quantidade2);
        System.out.println("VALOR A PAGAR: R$ " + df.format(pagamento));


        terminal.close();
    }
}
