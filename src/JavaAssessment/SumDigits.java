package JavaAssessment;

public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(45214));
        System.out.println(4521);
        System.out.println(452);
    }

    public static int sumOfDigits(int numbers){
        int sum =-1;
        if(String.valueOf(numbers).length() == 4){
            sum=0;
            while (numbers > 0){
                sum += numbers % 10;
                numbers /= 10;
            }
        }
        return sum;
    }
}
