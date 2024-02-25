import java.util.Scanner;

public class ATV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int soma = number1 + number2;

        System.out.printf("A soma dos dois numeros é igual a %d" , soma);

        sc.close();
    }
}