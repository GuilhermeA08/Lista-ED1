import java.util.Scanner;

public class Q10 {

  public static void main(String[] args) throws Exception {
    int numero;
    try (Scanner ler = new Scanner(System.in)) {
      numero = ler.nextInt();
    }
    if (numero % 2 == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }
}
