import java.util.*;

public class sumOfn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i=1 ; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of n natural number is : "+sum);
    }   
}
