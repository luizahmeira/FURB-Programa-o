import java.util.Scanner;
public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe o valor da sua renda: ");
        float renda = terminal.nextFloat();
        System.out.println("Informe quantos dependentes você tem: ");
        int dependentes = terminal.nextInt();
        float rLiquida = renda - ((renda * 0.02f) * dependentes);

        if(rLiquida <= 2000) {
            System.out.println("Não paga imposto");
        } else if(rLiquida > 2000 && rLiquida < 5000) {
            System.out.println("Valor do imposto:" + (rLiquida * 0.05f));
        } else if(rLiquida > 5000 && rLiquida < 10000) {
            System.out.println("Valor do imposto: " + (rLiquida * 0.10f));
        } else if (renda >= 10000) {
            System.out.println("Valor do imposto: " + (rLiquida * 0.15f));
        }
        terminal.close();
    }
}