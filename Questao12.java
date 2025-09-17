import java.util.Scanner;

public class Questao12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------MENU------:");
        System.out.println("1. para somar:");
        System.out.println("2. para divisão:");
        System.out.println("3. para subtração:");
        int  opcao = scanner.nextInt();
        switch(opcao)
        {
            case 1:
                    System.out.println("digite o primeiro numero:");
                double num1 = scanner.nextFloat();
                    System.out.println("digite o segundo numero:");
                double num2 = scanner.nextFloat();
                double soma = (num1+num2);
                    System.out.println("o resultado e: " + (num1+num2));
            case 2:
                    System.out.println("digite o primeiro numero:");
                double num3 = scanner.nextFloat();
                    System.out.println("digite o segundo numero:");
                double num4 = scanner.nextFloat();
                double divisao = (num3/num4);
                    System.out.println("o resultado e: " + divisao);
            case 3:
                    System.out.println("digite o primeiro numero:");
                double num5 = scanner.nextFloat();
                    System.out.println("digite o segundo numero:");
                double num6 = scanner.nextFloat();
                double subtracao = (num5 - num6);
                    System.out.println("o resultado e: " + subtracao);

            }
        }
    }

