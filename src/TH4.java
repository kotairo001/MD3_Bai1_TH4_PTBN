import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a");
        double a = scanner.nextDouble();
        System.out.println("Input number b");
        double b = scanner.nextDouble();
        System.out.println("Input number c");
        double c = scanner.nextDouble();
        if(a!=0){
            double x = (c-b);
            System.out.println("The result is " + x);
        } else {
            if(b==c) {
                System.out.println("The result is all x");
            } else {
                System.out.println("No result");
            }
        }

    }
}
