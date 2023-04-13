package JavaAssessment;

public class Hypotenuse {

    public static void main(String[] args) {
        System.out.println(hypo(5, (10)));
    }


    public static double hypo(double side1, double side2){


        double hypotenuse= Math.sqrt((Math.pow(side1,side2) + Math.pow(side2,side1)));
        return hypotenuse;

    }
}

