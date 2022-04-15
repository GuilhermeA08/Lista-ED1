import java.util.Scanner;

public class Q18 {

  static final String password = "olamundo";
  public static Scanner ler = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    pass_DoWhile();
    pass_While();
  }

  public static void pass_While() {
    String senha;
    System.out.println("Senha | While: ");

    senha = ler.next();

    while (!senha.equals(password)) {
      System.out.println("Senha Incorreta: tente novamente!");
      senha = ler.next();
    }

    System.out.println("Senha correta!");
    System.out.println("");
  }

  public static void pass_DoWhile() {
    String senha;
    System.out.println("Senha | Do While: ");

    do {
      senha = ler.next();

      if (!senha.equals(password)) {
        System.out.println("Senha Incorreta");
      }
    } while (!senha.equals(password));

    System.out.println("Senha correta!");
    System.out.println();
  }
}
