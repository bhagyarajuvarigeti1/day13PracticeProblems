import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
         Integer num1, num2, num3;
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        solve(num1, num2, num3);
    }
    public static <T extends Comparable<T>> void solve(T num1, T num2, T num3) {
        T maxNum = num1;
        if(num2.compareTo(maxNum) > 0){
            maxNum = num2;
        }
        if(num3.compareTo(maxNum) > 0){
            maxNum = num3;
        }
        System.out.println(maxNum);
    }
}
