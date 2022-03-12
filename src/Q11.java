import java.util.Scanner;

public class Q11 {

  public static void main(String[] args) throws Exception {
    float conta_a = 100, conta_b = 100;
    float transferencia;
    try (Scanner ler = new Scanner(System.in)) {
      transferencia = ler.nextFloat();
    }
    if (transferencia <= conta_a) {
      conta_a -= transferencia;
      conta_b += transferencia;
      System.out.println(conta_a);
      System.out.println(conta_b);
    } else {
      System.out.println("Saldo Insuficiente");
    }
  }
}
