import java.util.Scanner;

public class bai3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap 2 so de tinh toan: ");
        System.out.print("Nhap so thu nhat= ");
        float a = scanner.nextFloat();
        System.out.print("Nhap so thu hai= ");
        float b = scanner.nextFloat();
        System.out.println("---Lua chon phep tinh---");
        System.out.println("1.Phep cong(+)");
        System.out.println("2.Phep tru(-)");
        System.out.println("3.Phep nhan(*)");
        System.out.println("4.Phep chia(/)");
        System.out.println("nhap (1-4) de lua chon phep tinh: ");
        int chon = scanner.nextInt();
        switch (chon)
        {
            case 1:System.out.println("thuc hien phep cong:"+ (a+b));
                break;
            case 2:System.out.println("thuc hien phep tru:"+ (a-b));
                break;
            case 3:System.out.println("thuc hien phep nhan:"+ (a*b));
                break;
            case 4:
                if(b != 0){
                    System.out.println("thuc hien phep chia:"+ (a/b));
                }
                else{
                    System.out.println("ERROR!");
                }
                break;
            default:
                System.out.println("lua chon khong hop le!");
                break;
        }
    }
}
