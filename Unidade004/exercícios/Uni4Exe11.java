import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento do filho1: ");
        int filho1 = terminal.nextInt();
        System.out.println("Informe o ano de nascimento do filho2: ");
        int filho2 = terminal.nextInt();
        System.out.println("Informe o ano de nascimento do filho3: ");
        int filho3 = terminal.nextInt();
        
        if(filho1 != filho2 && filho1 != filho3 && filho3 != filho2) {
            System.out.println("Os três são APENAS IRMÃOS");
        } else if(filho1 == filho2 && filho1 != filho3 || filho3 == filho2 && filho3 != filho1 || filho1 == filho3 && filho1 != filho2) {
            System.out.println("eles são GÊMEOS");
        } else if(filho1 == filho2 && filho2 == filho3) {
            System.out.println("eles são TRIGÊMEOS");
        }
        terminal.close();
    }    
}
