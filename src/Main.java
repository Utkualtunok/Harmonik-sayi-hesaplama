import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcı veri girişi
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = inp.nextInt();
        
        double sonuc = 0.0;

        //Harmonik için gerekli olan bölme işlemini for döngüsünden sonra kullanacağız.
        for (int i = 1; i <= n; i++) {
            sonuc += (1.0/i);
        }
        System.out.println(sonuc);

    }
}