/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecttitik;

/**
 *
 * @author ASUS
 */
public class Operasititik {
   
}
        public static void main(String[] args) {

        public class Titik {
        Scanner cin = new Scanner(System.in);
        protected int x,y;
        public Titik (){
        x = 0;
        y = 0;
        }
        public void inisialisasiTitik(){
        System.out.println("Masukan Nilai x : " );
        this.x = cin.nextInt();
        System.out.println("Masukan Nilai y : " );
        y = cin.nextInt();
        }
        public void tampilTitik(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        }
        public void perkalianSkalar(){
        int s;
        s = cin.nextInt();
        System.out.println("skalar = " + ((s * x )+ (s * y)));
        }
        public void pencerminanSumbuX(){
        System.out.println("pencerminanSumbuX = " + (x - (x + x)));
        }
        public void pencerminanSumbuY(){
        System.out.println("pencerminanSumbuY = " + (y - (y + y)));
        }
        public int jarak (){
        int x2,y2;
        x2 = cin.nextInt();
        y2 = cin.nextInt();
        return (int) Math.sqrt(((x2 - x )* (x2 - x)) + ((y2 - y) * (y2 - y)));
        }
        }
        }
        public static void main(String[] args) {
        public class Operasititik {
        public static void main(String[] args) {
        Titik Objek = new Titik ();
        Menu mathMenu = new Menu();
        do {
        mathMenu.menuPilihan();
        switch (mathMenu.pilihan){
        case 1 :
        Objek.inisialisasiTitik();
        break;
        case 2 :
        Objek.tampilTitik();
        break;
        case 3 :
        Objek.perkalianSkalar();
        break;
        case 4 :
        Objek.pencerminanSumbuX();
        break;
        case 5 :
        Objek.pencerminanSumbuY();
        break;
        case 6 :
        System.out.println("Jarak = " + Objek.jarak());
        break;
        case 0 :
        System.out.println("Anda Surender");
        break;
        default :
        System.out.println("Pilihan Anda Salah");
        break;
        }
        }while(mathMenu.pilihan!=0);
        }
        }
        }
        public class menutitik {
        }
        import java.util.Scanner;
        public class Menu {
        public int pilihan = 0;
        public int menuPilihan(){
        Scanner cin = new Scanner(System.in);
        System.out.println("1. Inisial Titik");
        System.out.println("2. Tampil Titk");
        System.out.println("3. Perkaliahan Skalar Titk");
        System.out.println("4. Pencerinan Terhadap Sumbuh X");
        System.out.println("5. Pencerinan Terhadap Sumbuh y");
        System.out.println("6. Jarak Antar Dua Titik");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("Masukan Pilihan Anda : ");
        this.pilihan = cin.nextInt();
        return this.pilihan;
        }
        }
