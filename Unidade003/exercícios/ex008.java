import java.util.Scanner;
import java.text.DecimalFormat;
public class ex008 {
    public static void main(String[] args) {
        Scanner terminal =  new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
        // Para isto ela entregou um valor em dólares para o atendente.
        // Considerando que o atendente tem a cotação do dólar, descreva um programa para calcular quantos reais
        // o atendente deve devolver para a pessoa.

        //perguntar quantos dólares foram entregues, criar váriavel de reais e de dólares
        System.out.print("Quantos dólares foram entregues: ");
        double dolar = terminal.nextDouble();

        double reais = 5.17;

        double retorno = dolar * reais;
        System.out.print("Retorno em reais é: R$" + df.format(retorno));
        
        terminal.close();
    }
}
