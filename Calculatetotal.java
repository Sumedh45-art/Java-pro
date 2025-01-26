import java.util.*;

public class calculateTotal {

    public static int calculateTotal(int value) {
        return value;
    }

    public static int calculateTotal(int value, int quantity) {
        return value * quantity;
    }

    public static int calculateTotal(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = scanner.nextInt();
        int res = 0;
        switch(inputs){
            case 1:
                int n1 = scanner.nextInt();
                res = calculateTotal(n1);
                break;
            case 2:
                int price = scanner.nextInt();
                int quantity = scanner.nextInt();
                res = calculateTotal(price, quantity);
                break;
            case 3:
                int p1 = scanner.nextInt();
                int p3 = scanner.nextInt();
                int p2 = scanner.nextInt();
                res = calculateTotal(p1, p2, p3);
                break; 
        }
        System.out.println("Total price : " + res);

        scanner.close();
    }
}
