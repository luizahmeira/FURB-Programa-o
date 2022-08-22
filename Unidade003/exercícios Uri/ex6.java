import java.text.DecimalFormat; 
import java.util.Scanner; 


public class ex6 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        
        int numero = terminal.nextInt();
        int horat = terminal.nextInt();
        double valor = terminal.nextDouble(); 
        double salário = horat * valor;
        
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + df.format(salário));
        terminal.close();
        
        
    }
    
}


