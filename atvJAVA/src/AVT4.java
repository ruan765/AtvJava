import java.util.Scanner;

public class AVT4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Double gastosJaneiro = 15000.00;
         Double gastosFevereiro = 23000.00;
         Double gastosMarço = 17000.00;
         Double mediaGastos = (gastosJaneiro + gastosFevereiro + gastosMarço) / 3;
         Double gastoTotal = gastosJaneiro + gastosFevereiro + gastosMarço;
         System.out.printf("Gastos totais no trimestre %.2f %n" , mediaGastos);
         System.out.printf("Media de gastos no trimestre %.2f %n" , gastoTotal);

         sc.close();
    }
    

}
