import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();
        if ( n > 0) {
            System.out.println("Numero positivo");
        }
        else if (n < 0) {
            System.out.println("Numero negativo");
        }
        else {
            System.out.println("O numero é 0");
        }
        

        sc.close();
    }
}
