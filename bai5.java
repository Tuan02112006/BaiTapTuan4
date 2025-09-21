import java.util.Scanner;

public class bai5{
    public static void main(String[] args) {
        Scanner nt = new Scanner(System.in);
        System.out.println(" nhập vào 1 số nguyên ");
        int input = nt.nextInt();
        if (input <= 1) {
            System.out.println("đây không phải là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(input); i++) {
                if (input % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check == true){
                System.out.println("đây là 1 số nguyên tố");
            }
            else
                System.out.println("đây không phải là 1 số nguyên tố");

        }
    }
}