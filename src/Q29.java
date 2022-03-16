import java.util.Scanner;

public class Q29 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    String frase;
    frase = ler.nextLine();

    frase = InvertFrase(frase);
    System.out.println(frase);
  }

  public static String InvertFrase(String frase) {
    String reverse = "";

    for (int i = frase.length() - 1; i >= 0; i--) {
      reverse += frase.charAt(i);
    }

    return reverse;
  }
}
