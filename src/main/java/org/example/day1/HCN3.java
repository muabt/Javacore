import java.util.Scanner;
public class HCN3 {
    public static void main(String[] args) {
        double a = -1, b = -1;
        boolean hasDefault = false;
        // Kiến thức mới try-catch
        try{
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            hasDefault = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Scanner in = new Scanner(System.in);
        if(!hasDefault ||  a <= 0 || b <= 0) {
            while (true) {
                if (a > 0 && b > 0) {
                    break;
                } else {
                    System.out.println("Cac canh phai la so duong");
                }
                System.out.print("Nhap chieu dai: ");
                a = in.nextDouble();
                System.out.print("Nhap chieu rong: ");
                b = in.nextDouble();
            }
        }
        in.close();
        double cv = (a+b)*2;
        System.out.printf("Chu vi = %.2f cm^2 \n", cv);
        System.out.println("Ket thuc chuong trinh");
    }
}