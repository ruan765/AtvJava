import java.util.Scanner;

public class ATV3 {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Verificador se numero é impar ou par");
    System.out.println("Digite um numero");
    int number = sc.nextInt();

    if ( (number % 2) == 0) {
        System.out.println("Numero par");
    }
    else {
        System.out.println("Numero impar");
    }
    
    sc.close();
}
}
