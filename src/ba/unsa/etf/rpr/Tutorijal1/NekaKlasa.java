package ba.unsa.etf.rpr.Tutorijal1;
import java.util.Scanner;
public class NekaKlasa {
    public static int sumaCiafra (int n) {
        int suma = 0;
        while (n != 0) {
            suma = suma + (n % 10);
            n = n / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n = new Integer(ulaz.nextInt());
        for (int i = 2; i < n; i++)
            if (i % sumaCiafra(i) == 0) System.out.printf(" %d", i);
    }
}
