import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap  cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " );
            arr[i] = sc.nextInt();
        }
        int tong=0;
        for (int i = 0; i < n; i++) {
            tong = tong + arr[i];
        }
        System.out.println("Tong cac phan tu cua mang la: " + tong);
        sc.close();
    }
}
