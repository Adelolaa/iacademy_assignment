package JavaAssessment;

public class AssessmentTwo {

    public static void main(String[] args) {
        System.out.println(quotient(250,35));

    }
    public static int quotient(int a, int b){
   int remainder =  a%b;
   int Result = a-remainder;
   return  Result / b;

    }
}
