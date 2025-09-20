import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Btap8 {
    public static void Nhap(int[] arr, int n, Scanner sc) {
        System.out.println("Nhập mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị của phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void xuathienmax(int[] arr, int n) {
        Map<Integer, Integer> dem = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int giatri = arr[i];
            if (dem.containsKey(giatri)) {
                dem.put(giatri, dem.get(giatri) + 1); // Tăng tần suất lên 1 nếu giá trị đã có trong map
            } else {
                dem.put(giatri, 1); // tạo tần suất mới khi giá trị chưa có trong map
            }
        }

        int soNhieuNhat = arr[0];
        int tanSuatMax = dem.get(soNhieuNhat);

        for (int key : dem.keySet()) {
            int tanSuat = dem.get(key);
            if (tanSuat > tanSuatMax) {
                tanSuatMax = tanSuat;
                soNhieuNhat = key;
            }
        }

        System.out.println("Số xuất hiện nhiều nhất là: " + soNhieuNhat);
        System.out.println("Xuất hiện " + tanSuatMax + " lần.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Nhập số lượng phần tử trong mảng: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        Nhap(arr, n, sc);
        xuathienmax(arr, n);
    }
}
