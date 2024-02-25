public class ATV10 {
    public static void main(String[] args) {
        int atual = 1;
        int anterior = 0;
        int n = 0;
        System.out.println(anterior);
        System.out.println(atual);
        for (int i = 0; i<=10; i++) {
            anterior = n;
            n = atual;
            atual += anterior;

            
            
            System.out.println(atual);





        }
     }
    
}
