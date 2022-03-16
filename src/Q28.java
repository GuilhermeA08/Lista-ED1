import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q28 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.print("Tamanho do vetor: ");
    int tam_vetor = ler.nextInt();

    List<Integer> vetor = new Vector<Integer>(tam_vetor);

    for (int i = 0; i < tam_vetor; i++) {
      System.out.print("Posição[" + i + "]: ");
      vetor.add(i, ler.nextInt());
    }

    System.out.println();
    for (int i = 0; i < tam_vetor; i++) {
      System.out.print(vetor.get(i) + " ");
    }

    System.out.println();
    List<Integer> vet = MoveToFirst(vetor);
    for (int i = 0; i < tam_vetor; i++) {
      System.out.print(vet.get(i) + " ");
    }
    System.out.println();
  }

  public static List<Integer> MoveToFirst(List<Integer> vet) {
    int tmp;

    for (int i = (vet.size() - 1); i > 0; i--) {
      tmp = vet.get(i);
      vet.set(i, vet.get(i - 1));
      vet.set(i - 1, tmp);
    }

    return vet;
  }
}
