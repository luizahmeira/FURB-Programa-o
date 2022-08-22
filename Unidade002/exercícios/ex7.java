import java.text.DecimalFormat; //formatar numeros decimais
import java.util.Scanner; //ler informaçao do teclado


public class ex7 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe seu número de funcionário: ");
        int funcionário = terminal.nextInt();

        System.out.print("Informe o valor de uma hora trabalhada: ");
        float horat = terminal.nextFloat();

        System.out.print("informe quantas horas trabalhadas o senhor(a) trabalha: ");
        float horas = terminal.nextFloat(); 

        float salário = horat * horas;
        System.out.print("Funcionário número: " + funcionário + "Seu sálario é: " + df.format(salário));
 
        terminal.close();
        
    }
    
}
