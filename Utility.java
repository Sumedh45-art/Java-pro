import java.util.*;

public class utility{

    public static void compare(int n1, int n2) {
        if(n1 == n2) System.out.println("Both are equal.");
        else if(n1 > n2) System.out.println(n1 + " is greater.");
        else System.out.println(n2 + " is greater.");
    }
    public static void compare(char ch1, char ch2) {
        if(ch1 == ch2) System.out.printf("Both are equal.");
        else if(ch1 > ch2) System.out.printf("'%c' is greater.", ch1);
        else System.out.printf("'%c' is greater.", ch2);
    }
    public static void compare(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 == n2) System.out.printf("Both are equal.");
        else if(n1 > n2) System.out.printf("\"%s\" is greater.", s1);
        else System.out.printf( "\"%s\" is greater.", s2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = scanner.nextInt();
        switch(inputs){
            case 1:
                int n1 = scanner.nextInt();
                int n2 = scanner.nextInt();
                compare(n1, n2);
                break;
            case 2:
                char ch1 = scanner.next().charAt(0);
                char ch2 = scanner.next().charAt(0);
                compare(ch1, ch2);
                break;
            case 3:
                scanner.nextLine();
                String s1 = scanner.nextLine();
                String s2 = scanner.nextLine();
                compare(s1, s2);
                break;
        }
        scanner.close();
    }
}
