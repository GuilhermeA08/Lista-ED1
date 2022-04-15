import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q25 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print("Tamanho do vetor: ");
    int x = ler.nextInt();
    int y = ler.nextInt();

    List<List<Integer>> vetor = new Vector<List<Integer>>(x);

    for (int i = 0; i < x; i++) {
      vetor.add(new Vector<Integer>(y));
      for (int j = 0; j < y; j++) {
        System.out.print("Posição[" + i + "][" + j + "]: ");
        vetor.get(i).add(ler.nextInt());
      }
    }

    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        System.out.print(" " + vetor.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }
}
