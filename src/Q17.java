import java.util.Scanner;

public class Q17 {

  public static void main(String[] args) throws Exception {
    int num_inicial, num_final;

    try (Scanner ler = new Scanner(System.in)) {
      num_inicial = ler.nextInt();
      num_final = ler.nextInt();
    }

    if (num_inicial % 2 == 0) {
      num_inicial++;
    }

    seq_While(num_inicial, num_final);
    seq_DoWhile(num_inicial, num_final);
    seq_for(num_inicial, num_final);
  }

  public static void seq_While(int num_inicial, int num_final) {
    System.out.println("While: ");

    while (num_inicial <= num_final) {
      System.out.print(num_inicial + " ");
      num_inicial += 2;
    }
    System.out.println("");
  }

  public static void seq_DoWhile(int num_inicial, int num_final) {
    System.out.println("Do While: ");

    do {
      System.out.print(num_inicial + " ");
      num_inicial += 2;
    } while (num_inicial <= num_final);
    System.out.println();
  }

  public static void seq_for(int num_inicial, int num_final) {
    System.out.println("For: ");

    for (int i = num_inicial; i <= num_final; i += 2) {
      System.out.print(i + " ");
    }

    System.out.println("");
  }
}
