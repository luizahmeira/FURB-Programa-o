import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = terminal.nextLine();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double horasT = terminal.nextDouble();

        System.out.println("Informe a quantidade de dependentes: ");
        int dependentes = terminal.nextInt();

        double salarioTrabalho = horasT * 10;
        double salarioFamilia = dependentes * 60;

        double inss = salarioTrabalho * 0.085;
        double imposto = salarioTrabalho * 0.05;

        double salarioBruto = (salarioTrabalho + salarioFamilia);
        double salarioLiquido = (salarioTrabalho + salarioFamilia) - (inss + imposto);

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário líquido: " + salarioLiquido);

        terminal.close();
    }
}
