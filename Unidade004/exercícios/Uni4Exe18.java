import java.util.Scanner;
public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Informe o dia do vencimento: ");
            int diaVencimento = terminal.nextInt();
            System.out.println("Informe o dia do pagamento: ");
            int diaPagamento = terminal.nextInt();
            System.out.println("Informe o valor da prestação: ");
            float valorPrestacao = terminal.nextFloat();

            if(diaPagamento <= diaVencimento) {
                System.out.println("Pagamento está em dia, Valor do pagamento é: " + (valorPrestacao - (valorPrestacao * 0.1f)));
            } else if(diaPagamento > diaVencimento && diaPagamento < (diaVencimento + 5)) {
                System.out.println("Valor do pagamento é: " + valorPrestacao);
            } else if(diaPagamento > diaVencimento + 5) {
                int atraso = diaPagamento - (diaVencimento + 5);
                System.out.println("Valor do pagamento com juros é: " + (valorPrestacao+(atraso *(valorPrestacao * 0.02f))));
            }
        terminal.close();
    }

}
