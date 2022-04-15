import java.util.Scanner;

public class Q6 {

  public static void main(String[] args) throws Exception {
    final float pizza = 3.00f, refrigerante = 1.50f, taxa = 0.1f;

    int numero_pessoas, numero_fatias, numero_refri;
    try (Scanner ler = new Scanner(System.in)) {
      numero_pessoas = ler.nextInt();
      numero_fatias = ler.nextInt();
      numero_refri = ler.nextInt();
    }
    float total = (numero_fatias * pizza) + (numero_refri * refrigerante);
    float total_taxa = total + total * taxa;
    System.out.println(total);
    System.out.println(total_taxa);
    System.out.println(total_taxa / numero_pessoas);
  }
}
