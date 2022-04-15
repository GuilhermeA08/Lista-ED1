import java.util.Scanner;

public class Q7 {

  public static void main(String[] args) throws Exception {
    float numero1, numero2;
    try (Scanner ler = new Scanner(System.in)) {
      numero1 = ler.nextFloat();
      numero2 = ler.nextFloat();
    }
    if (numero2 != 0) {
      float media = (numero1 + numero2) / 2;
      System.out.println(media);
    } else {
      System.out.println("Divisão por 0!!!");
    }
  }
}
