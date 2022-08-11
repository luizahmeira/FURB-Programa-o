import java.text.DecimalFormat; //formatar numeros decimais
import java.util.Scanner; //ler informaçao do teclado

public class furb005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //significa que quer fazer a leitura do teclado
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Informe sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Informe um valor R$: ");
        double valor = teclado.nextDouble();

        System.out.println("A idade informada foi: " + idade);
        System.out.println("O valor é: " + df.format(valor));


         teclado.close();
    }
}
