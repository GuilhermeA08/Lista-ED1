import java.util.Scanner;

public class Q33 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) {
    String texto = ler.nextLine();
    String[] palavras = texto.split(" ");

    for (int i = 0; i < palavras.length; i++) {
      String palavra = palavras[i];
      if (palavras[i] != "") {
        int count = 0;
        for (int j = 0; j < palavras.length; j++) {
          if (palavras[j].equals(palavra)) {
            count++;
            palavras[j] = "";
          }
        }
        System.out.print(" " + palavra + ": " + count);
      }
    }

    System.out.println();
  }
}
