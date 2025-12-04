public class Exercise4_6_Multadd {

    // a * b + c islemini yapar
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * exp(-x) + (1 - exp(-x)) degerini hesaplar
    public static double expSum(double x) {
        double expNegX = Math.exp(-x);
        return x * expNegX + (1.0 - expNegX);
    }

    public static void main(String[] args) {
        // 1) multadd(1.0, 2.0, 3.0)
        double r1 = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd(1.0, 2.0, 3.0) = " + r1);

        // 2) sin(pi/4) + cos(pi/4) / 2
        double angle = Math.PI / 4.0;
        double trigResult = multadd(Math.sin(angle), 1.0, Math.cos(angle) / 2.0);
        System.out.println("sin(pi/4) + cos(pi/4) / 2 = " + trigResult);

        // 3) log(10) + log(20)
        double logResult = multadd(Math.log(10.0), 1.0, Math.log(20.0));
        System.out.println("log(10) + log(20) = " + logResult);

        // 4) expSum(x) testi
        double x = 1.0;
        double expResult = expSum(x);
        System.out.println("expSum(1.0) = " + expResult);
    }
}
