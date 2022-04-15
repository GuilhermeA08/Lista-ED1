import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q24 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print("Tamanho do vetor: ");
    int tam_vetor = ler.nextInt();

    List<Integer> vetor = new Vector<Integer>(tam_vetor);

    for (int i = 0; i < tam_vetor; i++) {
      System.out.print("Posição[" + i + "]: ");
      vetor.add(i, ler.nextInt());
    }

    for (int i = 0; i < tam_vetor; i++) {
      System.out.print("Posição[" + i + "]: ");
      System.out.println(vetor.get(i));
    }
  }
}
