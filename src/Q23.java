import java.util.Scanner;

public class Q23 {

  static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    int num, menu;

    do {
      Menu();
      menu = ler.nextInt();
      System.out.print("\033[H\033[2J");

      switch (menu) {
        case 1:
          System.out.print("\033[H\033[2J");
          System.out.print("Potenciação: ");
          num = ler.nextInt();
          System.out.println("Resultado: " + (Math.pow(num, 2)));
          break;
        case 2:
          System.out.print("\033[H\033[2J");
          System.out.print("Raiz Quadrada: ");
          num = ler.nextInt();
          System.out.println("Resultado: " + (Math.sqrt(num)));
          break;
        case 3:
          System.out.print("\033[H\033[2J");
          System.out.print("Fatorial: ");
          num = ler.nextInt();
          System.out.println("Resultado: " + (Fatorial(num)));
          break;
        case 0:
          System.out.print("\033[H\033[2J");
          System.out.print("Saindo ");
          break;
      }
    } while (menu != 0);
  }

  public static int Fatorial(int num_fat) {
    int total = 1;

    for (int i = 1; i <= num_fat; i++) {
      total *= i;
    }

    return total;
  }

  public static void Menu() {
    System.out.println("1 - Potenciação");
    System.out.println("2 - Raiz Quadrada");
    System.out.println("3 - Fatorial");
    System.out.println("0 - Sair");
  }
}
