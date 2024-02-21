
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti de la tastatura numarul dorit: ");
        double nr = scanner.nextDouble();

        if (nr > 0)
        {
            System.out.println("Numarul introdus este pozitiv");
        }
        if (nr < 0)
        {
            System.out.println("Numarul introdus este negativ");
        }
        if(nr == 0)
        {
            System.out.println("Numarul introdus este zero");
        }

        scanner.close();
    }
}
