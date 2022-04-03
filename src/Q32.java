import java.util.Scanner;

public class Q32 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {
    String palavra = ler.next();
    while (palavra.length() > 0) {
      char letra = palavra.charAt(0);
      palavra = palavra.substring(1, palavra.length());

      int count = 1;
      for (int i = 0; i < palavra.length(); i++) {
        if (palavra.charAt(i) == letra) {
          count++;
        }
      }
      palavra = palavra.replaceAll("" + letra, "");
      System.out.print(" " + letra + ": " + count);
    }
    System.out.println();
  }
}
