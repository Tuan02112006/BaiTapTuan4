import java.util.Scanner;

public class bai8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxCount = 0;
        int nhieunhat = arr[0];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                nhieunhat = arr[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: "
                + nhieunhat + " (xuat hien " + maxCount + " lan)");
    }
}
