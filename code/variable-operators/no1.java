public class no1 {
    public static void main(String[] args) {
        // calculate pythagoras with the following formula : c = sqrt(a^2 + b^2).
        // find the value of c if a and b vakes are given.

        int a = 36;
        int b = 323;
        int c;

        c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Value of c = " + c);



        // calculate the volume of a cone with the following formula : 1/3 * PI * r^2 * t.
        final double PI = 3.14;
        double r = 10;
        double t = 15;

        double formula = 0.33 * PI * r * r * t;
        System.out.println("Volume of cone = " + formula);
    }
}
