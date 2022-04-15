import java.util.Scanner;

public class Q14 {

  public static void main(String[] args) throws Exception {
    float a, b, c;

    try (Scanner ler = new Scanner(System.in)) {
      a = ler.nextFloat();
      b = ler.nextFloat();
      c = ler.nextFloat();
    }

    float delta = delta(a, b, c);
    equação(a, b, delta);
  }

  public static float delta(float a, float b, float c) {
    return b - (4 * a * c);
  }

  public static void equação(float a, float b, float delta) {
    if (delta < 0) {
      System.out.println("Não existe raizes reais");
    } else {
      float x;

      x = (float) (-b - (Math.sqrt(delta)));
      System.out.println(x);
      x = (float) (-b + (Math.sqrt(delta)));
      System.out.println(x);
    }
  }
}
