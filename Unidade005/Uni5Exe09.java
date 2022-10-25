package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
            System.out.println("Uma turma tem n alunos, sendo n igual a: ");
            int alunos = terminal.nextInt();
            int idadeAluno = 0;
            String nomeAluno = "";
            int maior20 = 0;
            String idade18 = "";

            for(int i = 1; i <= alunos; i++) {
                System.out.println("Informe o nome do aluno: ");
                nomeAluno = terminal.next();
                System.out.println("Informe a idade do aluno: ");
                idadeAluno = terminal.nextInt();
                
                if(idadeAluno == 18) {
                    idade18 = idade18 + nomeAluno + ", ";
                }
                if(idadeAluno > 20){
                    maior20++;
                }
            }
            System.out.println("A quantidade de alunos que tem a idade acima de 20 anos é: " + maior20);
            System.out.println("O nome dos alunos que tem 18 anos são: " + idade18);

        terminal.close();
    }
}