package JavaAssessment;

public class PerfectNum {

    public static void main(String[] args) {
        boolean x = IsPerfect(30);
        if (x) System.out.println("Perfect number");
        else System.out.println("Not a perfect number");
    }

    public static boolean IsPerfect(int n) {
        int sum = 0;
        String num = "";

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
                num = num + String.valueOf(i);
            }
        }
        System.out.println(num);
        if (sum == n)
            return true;

        return false;
    }
}

