import java.util.*;
public class luaslingkaran {
  public static void main(String[] args) {
    double r, luas, phi = 3.14;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang jari-jari lingkaran: ");
    r = scan.nextDouble();
    luas = phi * r * r;<br>
    System.out.println("Luas Lingkaran adalah "+luas);