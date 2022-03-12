import java.util.Scanner;

public class Q13 {

  public static void main(String[] args) throws Exception {
    float media;
    try (Scanner ler = new Scanner(System.in)) {
      media = ler.nextFloat();
    }
    if (media >= 7.0) {
      System.out.println("Aprovado");
    } else if (media >= 3.5) {
      System.out.println("Prova final");
      float prova_final = (50 - (6 * media)) / 4;
      System.out.println(prova_final);
    } else {
      System.out.println("Reprovado");
    }
  }
}
