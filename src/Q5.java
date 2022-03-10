import java.util.Scanner;

public class Q5 {

  public static void main(String[] args) throws Exception {
    float numero1, numero2, numero3;
    try (Scanner ler = new Scanner(System.in)) {
      numero1 = ler.nextFloat();
      numero2 = ler.nextFloat();
      numero3 = ler.nextFloat();
    }
    float media = (numero1 + numero2 + numero3) / 3;
    System.out.println(media);
  }
}
