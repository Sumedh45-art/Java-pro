import java.util.*;

public class PrimeArrays{

    public static boolean isPrime(int n){

        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;

        for(int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0) return false;

        return true;
    }

    public static ArrayList<Integer> UniqueFilter(ArrayList<Integer> OgArr){

        Set<Integer> set = new HashSet<>(OgArr);
        return new ArrayList<>(set);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int num = scanner.nextInt();
            if(isPrime(num)) arr.add(num);
        }
        System.err.println("List of prime numbers : " + arr);
        ArrayList<Integer> UniqueArr = UniqueFilter(arr);
        System.err.println("List of unique prime numbers : " + UniqueArr);
        scanner.close();
    }
}
