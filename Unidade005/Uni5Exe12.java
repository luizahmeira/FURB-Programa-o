package Unidade005.exercícios;

import java.util.Scanner;

public class Uni5Exe12 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    System.out.print("numero de linhas: ");
    int numero = terminal.nextInt(); 
    
    int contador = 0;
    String linha;

    for (int i = 0; i < numero; i++) {
      linha = "";
      for (int j = 0; j < i + 1; j++) {
        contador++;
        linha += contador + "\t";
      }
      System.out.println(linha);
    }
		terminal.close();
	}
}

