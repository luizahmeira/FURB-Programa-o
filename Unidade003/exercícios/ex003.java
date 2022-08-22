import java.util.Scanner;
import java.text.DecimalFormat;
public class ex003 {
    public static void main(String[] args) {
        // Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para
        //  ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros 
        //ele conseguiu colocar no tanque.
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
             System.out.print("Qual é o valor da gasolina?: ");
            float preço = terminal.nextFloat();

            System.out.print("Qual é o valor do pagamento?: ");
            float pagamento = terminal.nextFloat();

            float gasolina = (pagamento / preço);
            System.out.print("O senhor(a) conseguiu colocar: " + df.format(gasolina) + " litros");
        terminal.close();
    }
}
