import java.util.Scanner;

public class Btap10 {
    public static void Nhap(int[] arr, int n, Scanner sc) {
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void Xuat(int[] arr, int n) {
        System.out.println("Mảng hiện tại: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int Them(int[] arr, int n, int vt, int gt) {
        for (int i = n; i > vt; i--) {
            arr[i] = arr[i - 1];
        }
        arr[vt] = gt;
        n++;
        return n;
    }

    public static int Xoa(int[] arr, int n, int vt) {
        for (int i = vt; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử ban đầu: ");
        int n = sc.nextInt();

        int[] arr = new int[100];

        Nhap(arr, n, sc);
        Xuat(arr, n);

        int lc;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Thêm 1 phần tử");
            System.out.println("2. Xóa 1 phần tử");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn là: ");
            lc = sc.nextInt();

            switch (lc) {
                case 1:
                    System.out.print("Nhập vị trí cần thêm: ");
                    int vt1 = sc.nextInt();
                    System.out.print("Nhập giá trị cần thêm: ");
                    int gt = sc.nextInt();
                    n = Them(arr, n, vt1, gt);
                    Xuat(arr, n);
                    break;
                case 2:
                    System.out.print("Nhập vị trí cần xóa: ");
                    int vt2 = sc.nextInt();
                    n = Xoa(arr, n, vt2);
                    Xuat(arr, n);
                    break;
            }
        } while (lc != 0);
    }
}
