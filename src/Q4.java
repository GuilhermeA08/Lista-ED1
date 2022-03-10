import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) throws Exception {
    int numero1, numero2, numero3;
    try (Scanner ler = new Scanner(System.in)) {
      numero1 = ler.nextInt();
      numero2 = ler.nextInt();
      numero3 = ler.nextInt();
    }
    int media = (numero1 + numero2 + numero3) / 3;
    System.out.println(media);
  }
}
