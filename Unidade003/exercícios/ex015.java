import java.util.Scanner;
public class ex015 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int numero = terminal.nextInt();
        
        int centena = numero / 100;
        numero -= centena * 100;
        int dezena = numero / 10;
        numero -= dezena * 10;
        int unidade = numero / 1;
    
        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
        terminal.close();
    }
}
