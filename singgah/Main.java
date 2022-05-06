import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int angka1, angka2, hasil;

        Scanner inputan = new Scanner(System.in);

        System.out.print("Input angka-1 ");
        angka1 = inputan.nextInt();
        System.out.print("Input angka-2 ");
        angka2 = inputan.nextInt();

        hasil = angka1 & angka2 ;
        System.out.println("\n& = " + hasil );
        hasil = angka1 | angka2;
        System.out.println("| = " + hasil);
        hasil = angka1 ^ angka2;
        System.out.println("^ = " + hasil);
        hasil = ~angka1;
        System.out.println("~ = " + hasil);
        hasil = angka1 << angka2;
        System.out.println("<< = " + hasil);
        hasil = angka1 >> angka2;
        System.out.println(">> = " + hasil);
        hasil = angka1 >>> angka2;
        System.out.println(">>> = " + hasil);
    }
}
