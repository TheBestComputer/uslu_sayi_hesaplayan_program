
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a, b, total = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban sayi : ");
        a = scanner.nextInt();
        
        System.out.print("Us sayisi : ");
        b = scanner.nextInt();
        
        for(int i = 1; i <= b; i++){
            total *= a;
        }
        System.out.println("sonuc : " + total);
    }
}
