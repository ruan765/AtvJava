import java.util.Scanner;

public class ATV9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano que deseja verificar se é bissexto");
        int ano = sc.nextInt();

        if(ano % 4 == 0 )  {
            if ( !(ano % 100 == 0) || ano % 400 == 0) {
                System.out.println("Ano bissexto");
            }

        }

        else {
            System.out.println("ano não é bissexto");
        }


        sc.close();
    }
}
