import java.util.Scanner;
public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Informe o seu peso: ");
            float peso = terminal.nextFloat();
            System.out.println("Informe sua altura: ");
            float altura = terminal.nextFloat();
            float imc = peso/(altura * altura);

            if(imc < 18.5) {
                System.out.println("Magreza");
            } else if(imc > 18.5 && imc <= 24.9) {
                System.out.println("Saúdavel");
            } else if(imc >= 25.0 && imc <=29.9) {
                System.out.println("Sobrepeso");
            } else if(imc >= 30.0 && imc <=34.9) {
                System.out.println("Obesidade Grau I");
            } else if(imc >= 35.0 && imc <= 39.9) {
                System.out.println("Obesidade Grau II (severa)");
            } else if(imc >= 40.0) {
                System.out.println("Obesidade Grau III (mórbita)");
            }
        terminal.close();
    }
}
