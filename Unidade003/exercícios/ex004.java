import java.util.Scanner; //importando scanner da biblioteca (o scanner é oq lê o terminal)
public class ex004 {
    public static void main(String[] args) { //obrigatório
        // Faça um programa para ler três notas de um 
        // aluno em uma disciplina e imprimira sua média
        //  ponderada (as notas tem pesos respectivos de 5, 3 e 2)
        Scanner terminal = new Scanner(System.in); //dando nome pro terminal scanner
        
            System.out.println("Informe a primeira nota: "); //print ulando uma linha (escrever no terminal)
            float nota1 = terminal.nextFloat();
            System.out.print("Informe a segunda nota: ");
            float nota2 = terminal.nextFloat();
            System.out.print("Informe a terceira nota: ");
            float nota3 = terminal.nextFloat();
            float media = (nota1 * 0.5f) + (nota2 * 0.3f)+ (nota3 * 0.2f);
            System.out.print("Sua média foi: " + media);

        terminal.close(); //fechando terminal scanner
    }
    
}
