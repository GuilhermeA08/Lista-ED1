import java.util.Scanner;

public class Q21 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int inicial, fim;
    int total = 0;

    inicial = ler.nextInt();
    fim = ler.nextInt();

    for (int i = inicial; i <= fim; i++) {
      total += i;
    }

    System.out.println("Somatorio: " + total);
  }
}
