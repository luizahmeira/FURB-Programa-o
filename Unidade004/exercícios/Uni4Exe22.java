import java.util.Scanner;
public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Opção de curso: ");
            System.out.println("[1]  Ciência da Computação");
            System.out.println("[2]  Licenciatura da Computação");
            System.out.println("[3]  Sistemas de Informação");
            System.out.println("Digite o número da opção desejada: ");

            int curso = terminal.nextInt();

            switch(curso) {
                case 1: 
                    System.out.println("Título: Bacharel em Ciência da Computação");
                    break;
                case 2:
                    System.out.println("Título: Licenciado em Computação");
                    break;
                case 3: 
                    System.out.println("Título: Bacharel em Sistemas de Informação");
                    break;
            }
            
        terminal.close();
    }
}
