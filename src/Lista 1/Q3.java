import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws Exception {
        int numero1, numero2;
        try (Scanner ler = new Scanner(System.in)) {
            numero1 = ler.nextInt();
            numero2 = ler.nextInt();
        }

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 % numero2);
        

    }
}
