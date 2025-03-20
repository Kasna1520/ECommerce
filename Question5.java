import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;
        
        for (int i = mid; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = mid + 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}