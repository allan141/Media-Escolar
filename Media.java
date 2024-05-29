import java.util.Scanner;

public class Media{
  public static void main(String[] args) {
    Scanner n1 = new Scanner(System.in);
    double nota;
    System.out.println("Digite a sua primeira nota: ");
    nota = n1.nextDouble();

    Scanner n2 = new Scanner(System.in);
    double nota2;
    System.out.println("Digite a sua segunda nota: ");
    nota2 = n2.nextDouble();

    double media;
    media = (nota + nota2) / 2;

    if(media <= 4){
      System.out.println("Sua Média é " + media + " E Você está Reprovado!");
    }
    else if(media > 4 && media < 7){
      System.out.println("Sua Média é " + media + " E Você está em Recuperação!");
    } else{
      System.out.println("Sua Média é " + media + " Parabéns você está Aprovado!!");
    }
  }
} 
