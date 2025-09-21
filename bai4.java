import java.util.Scanner;

public class bai4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = scanner.nextInt();
        int S=0;
        for (int i = 1; i<=n;i++){
            S+=i;
        }
        System.out.println("Tong tu 1->n la: "+ S);
    }
}
