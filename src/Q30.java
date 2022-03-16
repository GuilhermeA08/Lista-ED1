import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q30 {

  static Scanner ler = new Scanner(System.in);

  enum Sexo {
    Homem,
    Mulher,
  }

  String cpf;
  String nome;
  int idade;
  Sexo sex;
  double peso;
  double altura;
  double imc;

  public static void main(String[] args) throws Exception {
    System.out.print("Quantas Pessoas deseja cadastrar? ");
    int num_pessoas = ler.nextInt();
    List<Q30> Pessoas = new ArrayList<Q30>(num_pessoas);
    Pessoas = cadastrarPessoas(num_pessoas, Pessoas);
    ListarPessoas(Pessoas);
  }

  public static void ListarPessoas(List<Q30> pessoasList) {
    for (int i = 0; i < pessoasList.size(); i++) {
      System.out.println("CPF: " + pessoasList.get(i).cpf);
      System.out.println("Nome: " + pessoasList.get(i).nome);
      System.out.println("Idade: " + pessoasList.get(i).idade);
      System.out.println("Sexo: " + pessoasList.get(i).sex);
      System.out.println("Peso: " + pessoasList.get(i).peso);
      System.out.println("Altura: " + pessoasList.get(i).altura);
      System.out.println("IMC: " + pessoasList.get(i).imc + "\n\n");
    }
  }

  public static List<Q30> cadastrarPessoas(
    int num_pessoas,
    List<Q30> pessoasList
  ) {
    for (int i = 0; i < num_pessoas; i++) {
      Q30 pessoa = new Q30();
      System.out.print("CPF: ");
      pessoa.cpf = ler.next();

      System.out.print("Nome: ");
      pessoa.nome = ler.next();
      System.out.print("Idade: ");
      pessoa.idade = ler.nextInt();
      System.out.print("Sexo: ");
      pessoa.sex = Sexo.valueOf(ler.next());
      System.out.print("Peso: ");
      pessoa.peso = ler.nextDouble();
      System.out.print("Altura: ");
      pessoa.altura = ler.nextDouble();
      pessoa.imc = pessoa.peso / Math.pow(pessoa.altura, 2);
      pessoasList.add(pessoa);

      System.out.println("\n\n");
    }
    return pessoasList;
  }

  public Q30(
    String cpf,
    String nome,
    int idade,
    Sexo sexo,
    double peso,
    double altura
  ) {
    this.cpf = cpf;
    this.nome = nome;
    this.idade = idade;
    this.sex = sexo;
    this.peso = peso;
    this.altura = altura;
    this.imc = peso / Math.pow(altura, 2);
  }

  public Q30() {}
}
