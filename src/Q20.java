import java.util.Scanner;

public class Q20 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int num;

    for (int i = 0; i < 5; i++) {
      num = ler.nextInt();
      primo(num);
    }
  }

  public static void primo(int num) {
    int count = 0;

    if (num % 2 == 0 && num != 2) {
      System.out.println("Não é primo!");
    } else {
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println("É primo!");
      } else {
        System.out.println("Não é primo!");
      }
    }
  }
}
