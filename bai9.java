import java.util.ArrayList;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = sc.nextInt();


        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            list.add(x);
        }

        // Bước 4: in danh sách
        System.out.println("Các phần tử trong danh sách là:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
