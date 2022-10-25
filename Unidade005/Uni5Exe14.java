package Unidade005.exercícios;
import java.util.Scanner;
public class Uni5Exe14 {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

    int lucro1 = 0;    int lucro2 = 0;    int lucro3 = 0;
    double percentualLucro;    double precoCompraTotal = 0;    double precoVendaTotal = 0;    double precoCompra;    double precoVenda;

    for (int i = 1; i < 21; i++) {
      System.out.printf("preco de compra da mercadoria %d: ", i);
      precoCompra = terminal.nextDouble();
      precoCompraTotal += precoCompra;

      System.out.printf("preco de venda da mercadoria %d: ", i);
      precoVenda = terminal.nextDouble();
      precoVendaTotal += precoVenda;

      percentualLucro = (precoVenda - precoCompra) / precoCompra;

      if (percentualLucro < 0.1) {
         lucro1 += 1; }
      else if (percentualLucro <= 0.2) {

         lucro2 += 1; }
      else {
         lucro3 += 1;
      }
    } 
    
    System.out.printf("mercadorias com lucro < 10%%: %d\n", lucro1);
    System.out.printf("mercadorias com 10%% < lucro <= 20%%: %d\n", lucro2);
    System.out.printf("mercadorias com lucro > 20%%: %d\n", lucro3);

    System.out.printf("valor total de venda: %.2f\n", precoVendaTotal);
    System.out.printf("valor total de compra: %.2f\n", precoCompraTotal);

    percentualLucro = (precoVendaTotal - precoCompraTotal) / precoCompraTotal;
    System.out.printf("lucro total: %.2f%%\n", percentualLucro * 100);

    terminal.close();
	}
}
