
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți de la tastatură numărul de elemente: ");
        int n = scanner.nextInt();

        double s = 0;

        for(int i=0; i<n; i++) {
            s = s + scanner.nextDouble();
        }

        System.out.println("Media aritmetică a numerelor introduse este: " + s / n);

        scanner.close();
    }
}
