import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int cons = scanner.nextInt();
        int rezult1 = cons / 100 % 10;
        int rezult2 = cons / 10 % 10;
        int rezult3 = cons % 10;
        System.out.println(rezult1 + "," + rezult2 + "," + rezult3);

    }
}