import java.util.Scanner;

public class Q22 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int num_fat = ler.nextInt();
    System.out.println(Fatorial(num_fat));
  }

  public static int Fatorial(int num_fat) {
    int total = 1;

    for (int i = 1; i <= num_fat; i++) {
      total *= i;
    }

    return total;
  }
}
