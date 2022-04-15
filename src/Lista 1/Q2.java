import java.util.Scanner;

public class Q2{
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) {
            int idade;
            idade = ler.nextInt();

            float altura;
            altura = ler.nextFloat();
            
            char letra; 
            letra = (char)System.in.read();

            String nome;
            nome = ler.next();
            
            

            System.out.println(idade);
            System.out.println(altura);
            System.out.println(letra);
            System.out.println(nome);
        }
    }
}