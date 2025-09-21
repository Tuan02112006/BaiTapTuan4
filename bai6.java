import java.util.Scanner;

public class bai6 {
    // Hàm tìm UCLN bằng đệ quy (Euclid)
    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    // Hàm tìm BCNN
    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        int u = ucln(a, b);
        int bcn = bcnn(a, b);

        System.out.println("UCLN của " + a + " và " + b + " = " + u);
        System.out.println("BCNN của " + a + " và " + b + " = " + bcn);
    }
}
