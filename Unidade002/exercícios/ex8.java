import java.text.DecimalFormat; //formatar numeros decimais
import java.util.Scanner; //ler informaçao do teclado


public class ex8 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe seu nome: ");
        String funcionário = terminal.nextLine();

        System.out.print("Informe seu salário fixo: ");
        float salário = terminal.nextFloat();

        System.out.print("informe quantas vendas o senhor(a) efetua por mês(em dinheiro): ");
        float vendas = terminal.nextFloat(); 

        float salárioFinal = salário + (vendas * 0.15f);
        System.out.println("Funcionário: " + funcionário);
        System.out.print("Seu sálario final é: " + df.format(salárioFinal));
        terminal.close();
        
    }
    
}
