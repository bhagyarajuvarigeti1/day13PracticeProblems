import java.util.Scanner;

public class TestMaximum<T> {
    public static void main(String[] args) {
        TestMaximum testMaximum = new TestMaximum();
        Scanner in = new Scanner(System.in);

        

    }
    public Integer getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber) > 0) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
    public Float getMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber) > 0) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }
    public String getMaximum(String s1, String s2, String s3){
        if(s1.length() <= s2.length() && s1.length() <= s3.length()){
            System.out.println(s1);
            return s1;
        }
        else if(s2.length() <= s1.length() && s2.length() <= s3.length()){
            System.out.println(s2);
            return s2;
        }
        else {
            System.out.println(s3);
            return s3;
        }
    }
    public <T extends Comparable<T>> void Maximum(T val1, T val2, T val3){
        T max = val1;
        if(val3.compareTo(max)<0){
            max = val3;
        }
        if(val2.compareTo(max) < 0){
            max = val2;
        }
        System.out.println(max);
    }
}
