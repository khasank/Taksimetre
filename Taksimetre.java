package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz.
        int km ;
        double odenecekTutar ;

        // Scanner sınıfı değişkenimizi tanımlıyoruz.
        Scanner giris = new Scanner(System.in);

        // Kullanıcıdan bilgi girisi işlemlerini yapıyoruz.
        System.out.print("Kaç KM yol gidildi ? : ");
        km = giris.nextInt();

        // Hesaplama işlemlerini yapıyoruz.
        odenecekTutar = 10+ (km * 2.20) ;
        odenecekTutar = ( odenecekTutar < 20 ) ? 20 : odenecekTutar ;

        // Ekrana çıktı işlemlerini yapıyoruz.
        System.out.println("Ödenecek Tutar : " + odenecekTutar);

    }
}
