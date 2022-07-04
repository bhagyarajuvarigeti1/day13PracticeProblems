import java.util.Scanner;

public class TestMaximum {
    public static void main(String[] args) {
        TestMaximum testMaximum = new TestMaximum();
        testMaximum.getMaximum(23.5F,235.5F, 234.333F);

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
            return s2
        }
        else {
            System.out.println(s3);
            return s3;
        }
    }
}
