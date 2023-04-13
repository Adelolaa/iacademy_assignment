package JavaAssessment;

public class PrimeNum {

    public static void main(String[] args) {
        boolean x = isPrime(23);
        if (x) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");

    }

    public static boolean isPrime(int value){
        boolean primeNumber = true;
        if (value >2){
            for (int i =2; i <= Math.sqrt(value); i++){
                if (value % i == 0){
                    primeNumber = false;
                }
            }
            if (primeNumber){
                System.out.println(value + "is a Prime Number");
            }
        }
        return primeNumber;
    }
}

