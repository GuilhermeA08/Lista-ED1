import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q26 {

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
    List<Integer> invertido = invert(vetor);
    for (int i = 0; i < invertido.size(); i++) {
      System.out.print(invertido.get(i) + " ");
    }
    System.out.println();
    ler.close();
  }

  public static List<Integer> invert(List<Integer> vetor) {
    int Tamanho = vetor.size();
    List<Integer> vetorInvertido = new Vector<Integer>(Tamanho);

    for (int i = 0; i < Tamanho; i++) {
      vetorInvertido.add(vetor.get((Tamanho - i) - 1));
    }
    return vetorInvertido;
  }
}
