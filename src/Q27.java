import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Q27 {

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
    MaiorMenor(vetor);
    System.out.println();
  }

  public static void MaiorMenor(List<Integer> vet) {
    int maior = vet.get(0), menor = vet.get(0), teste;
    for (int i = 0; i < vet.size(); i++) {
      teste = vet.get(i);
      if (maior < teste) {
        maior = teste;
      } else if (menor > teste) {
        menor = teste;
      }
    }
    System.out.println("Maior: " + maior + "  Menor: " + menor);
  }
}
