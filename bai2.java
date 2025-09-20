import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("nhap so a");
    int a = sc.nextInt();

    System.out.println("nhap so b");
    int b = sc.nextInt();

    System.out.printf("nhap so c");
    int c = sc.nextInt();

    int min = a;

    if(b<min)

    {
        min = b;
    }
    if(c<min)

    {
        min = c;
    }

    System.out.println("so nho nhat trong 3 so la " + min);
    sc.close();
}
}
