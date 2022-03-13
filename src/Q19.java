import java.util.Scanner;

public class Q19 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int num;

    num = ler.nextInt();

    if (num > 0 && num < 10) {
      for (int i = 1; i < 10; i++) {
        System.out.println(i + " x " + num + " = " + (i * num));
      }
    } else {
      System.out.println("Fora do Intervalo");
    }
  }
}
