import java.util.Scanner;
public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe a quantidade de meses que o funcoinario trabalha na empresa: ");
        int meses = terminal.nextInt();

        System.out.println("Informe o seu salário: ");
        float salario = terminal.nextFloat();

        float reajuste = 0f;

        if(meses <= 12) {
            reajuste = salario * 0.05f;
            System.out.println("O reajuste é: " + reajuste);
        } else if(meses >= 13 && meses < 49){
            reajuste = salario * 0.07f;
            System.out.println("O reajuste é: " + reajuste);
        }

        
        terminal.close();
    }
}