import java.util.Scanner;

public class Q12 {

  public static void main(String[] args) throws Exception {
    float media;
    try (Scanner ler = new Scanner(System.in)) {
      media = ler.nextFloat();
    }
    if (media >= 7.0) {
      System.out.println("Aprovado");
    } else if (media >= 3.5) {
      System.out.println("Prova final");
      System.out.println("Reprovado");
    }
  }
}
