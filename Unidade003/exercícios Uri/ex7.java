import java.text.DecimalFormat; 
import java.util.Scanner; 


public class ex7 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nome = terminal.nextLine();
        double salário = terminal.nextDouble();
        double vendas = terminal.nextDouble(); 

        System.out.println(nome);
        
        double salárioFinal = salário + (vendas * 0.15);
        System.out.println("TOTAL = R$ " + df.format(salárioFinal));
        terminal.close();
        
    }
    
}
