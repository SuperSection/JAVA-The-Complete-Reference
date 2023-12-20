package datatypes;

// Compute the area of a circle.
class AreaOfCircle {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8; // radius of circle
        pi = 3.1416; // value of pi, approximately
        a = pi * r * r; // compute area

        System.out.println("Area of circle is " + a);
    }
}
