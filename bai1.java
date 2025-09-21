import java.util.Scanner;

public class bai1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một số");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " la so duong");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else {
            System.out.printf("so nhap bang 0");
        }
        sc.close();
    }
}