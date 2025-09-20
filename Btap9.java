import java.util.Scanner;

public class Btap9 {
    public static void Nhap(int[] arr, int n, Scanner sc) {
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void Xuat(int[] arr, int n) {
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử có trong mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        Nhap(arr, n, sc);
        Xuat(arr, n);
    }
}
