import java.util.Scanner;

public class Q8 {

  public static void main(String[] args) throws Exception {
    float altura, peso;
    try (Scanner ler = new Scanner(System.in)) {
      System.out.print("Altura: ");
      altura = ler.nextFloat();
      System.out.print("Peso: ");
      peso = ler.nextFloat();
    }
    if (altura != 0) {
      float IMC = (peso) / (altura * altura);
      System.out.println(IMC);
    } else {
      System.out.println("Divisão por 0!!!");
    }
  }
}
