
public class Ex3 {
    public static boolean Prim(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (Ex3.Prim(i)==true && Ex3.Prim(i + 2)==true) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

}