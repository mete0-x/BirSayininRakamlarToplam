
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir Sayi Giriniz :");
        
        int sayi = scanner.nextInt();
        int toplam = 0;
       
        do {
        
        toplam += sayi % 10;

        sayi /= 10;
           
        

           }while(sayi > 0);

        System.out.println("toplam :" +toplam);
  }
}
