import java.lang.Math;
import java.util.Scanner;

public class Q9 {

  public static void main(String[] args) throws Exception {
    float raio;
    try (Scanner ler = new Scanner(System.in)) {
      System.out.print("raio: ");
      raio = ler.nextFloat();
    }
    if (raio > 0) {
      double area = Math.PI * (raio * raio);
      System.out.println(area);
    } else {
      System.out.println("Divisão por 0!!!");
    }
  }
}
