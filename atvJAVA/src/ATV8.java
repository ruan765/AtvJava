import java.util.Scanner;

public class ATV8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um numero que deseja obter o fatorial:");
        int number = sc.nextInt();
        

        for(int i = number; i > 1; i--) {
            fatorial *= i;
           
        }
        System.out.println(fatorial);
        
        sc.close();
    }
    
}
